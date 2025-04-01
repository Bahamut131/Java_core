package org.example.Lab_5.model;


import java.util.Date;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private Date birthDate;
    private String studentBookNumber;

    public Student(int id, String firstName, String lastName, String patronymic, Date birthDate, String studentBookNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.studentBookNumber = studentBookNumber;
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPatronymic() { return patronymic; }
    public Date getBirthDate() { return birthDate; }
    public String getStudentBookNumber() { return studentBookNumber; }

    @Override
    public String toString() {
        return id + ": " + firstName + " " + lastName + " " + patronymic + " | " + birthDate + " | " + studentBookNumber;
    }
}
