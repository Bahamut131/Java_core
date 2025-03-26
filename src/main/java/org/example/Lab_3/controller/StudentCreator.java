package org.example.Lab_3.controller;


import org.example.Lab_3.model.Sex;
import org.example.Lab_3.model.Student;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String patronymic, Sex sex) {
        return new Student(firstName, lastName, patronymic, sex);
    }
}

