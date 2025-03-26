package org.example.lab_4.controller;


import org.example.lab_4.model.Sex;
import org.example.lab_4.model.Student;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String patronymic, Sex sex) {
        return new Student(firstName, lastName, patronymic, sex);
    }
}

