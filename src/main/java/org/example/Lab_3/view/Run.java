package org.example.Lab_3.view;



import org.example.Lab_3.controller.UniversityCreator;
import org.example.Lab_3.model.Faculty;
import org.example.Lab_3.model.Human;
import org.example.Lab_3.model.University;

import java.io.IOException;
import java.util.List;


public class Run {
    public static void main(String[] args)  {
        createTypicalUniversity();
    }

    public static void createTypicalUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();
        System.out.println("The university was established: " + university.getName());

    }
}
