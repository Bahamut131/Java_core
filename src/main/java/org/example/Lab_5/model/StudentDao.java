package org.example.Lab_5.model;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class StudentDao {
    private static final String URL = "jdbc:sqlite:identifier.sqlite";

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String query = "SELECT * FROM StudentsTable";

        try (Connection connection = DriverManager.getConnection(URL);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            getStudent(students, resultSet);
        } catch (SQLException e) {
            System.err.println("Error while getting students:");
            e.printStackTrace();
        }
        return students;
    }


    public List<Student> getStudentsByMonth(int month) {
        List<Student> students = new ArrayList<>();
        String query = "SELECT * FROM StudentsTable WHERE strftime('%m', birthday) = ?";

        try (Connection connection = DriverManager.getConnection(URL);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, String.format("%02d", month));

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                getStudent(students, resultSet);
            }
        } catch (SQLException e) {
            System.err.println("Error when searching for students by month:");
            e.printStackTrace();
        }
        return students;
    }


    private void getStudent(List<Student> students, ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            String dateString = resultSet.getString("birthday");
            Date birthday = null;
            if (dateString != null) {
                try {
                    birthday = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
                } catch (ParseException e) {
                    System.err.println("Date parsing error: " + dateString);
                }
            }

            students.add(new Student(
                    resultSet.getInt("id"),
                    resultSet.getString("firstName"),
                    resultSet.getString("lastName"),
                    resultSet.getString("patronymic"),
                    birthday,
                    resultSet.getString("bookNumber")
            ));
        }
    }
}