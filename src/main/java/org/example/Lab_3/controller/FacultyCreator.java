package org.example.Lab_3.controller;


import org.example.Lab_3.model.Department;
import org.example.Lab_3.model.Faculty;
import org.example.Lab_3.model.Human;
import org.example.Lab_3.model.Sex;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }

    public Faculty createTypicalFaculty() {
        StudentCreator studentCreator = new StudentCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();

        Human head = studentCreator.createStudent("Andrei", "Semenov", "Vladimirovich", Sex.MALE);
        Faculty faculty = createFaculty("Faculty of Information Technology", head);

        Department department1 = departmentCreator.createTypicalDepartment();
        Department department2 = departmentCreator.createTypicalDepartment();

        faculty.addDepartment(department1);
        faculty.addDepartment(department2);

        return faculty;
    }
}
