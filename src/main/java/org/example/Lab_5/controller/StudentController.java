package org.example.Lab_5.controller;

import org.example.Lab_5.model.Student;
import org.example.Lab_5.model.StudentDao;

import java.util.List;

public class StudentController {
    private final StudentDao studentDao;

    public StudentController() {
        this.studentDao = new StudentDao();
    }

    public List<Student> fetchAllStudents() {
        return studentDao.getAllStudents();
    }

    public List<Student> fetchStudentsByMonth(int month) {
        return studentDao.getStudentsByMonth(month);
    }
}
