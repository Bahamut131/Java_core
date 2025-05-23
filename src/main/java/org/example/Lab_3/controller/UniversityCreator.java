package org.example.Lab_3.controller;



import org.example.Lab_3.model.Faculty;
import org.example.Lab_3.model.Human;
import org.example.Lab_3.model.Sex;
import org.example.Lab_3.model.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityCreator {
    public University createUniversity(String name, Human head, List<Faculty> faculties) {
        return new University(name, head,faculties);
    }

    public University createTypicalUniversity() {
        StudentCreator studentCreator = new StudentCreator();
        FacultyCreator facultyCreator = new FacultyCreator();

        Human head = studentCreator.createStudent("Victor", "Miller", "Ivanovich", Sex.MALE);
        Faculty faculty1 = facultyCreator.createTypicalFaculty();
        Faculty faculty2 = facultyCreator.createTypicalFaculty();
        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty1);
        faculties.add(faculty2);
        return createUniversity("Test University", head,faculties);
    }
}

