package org.example.lab_4.view;



import org.example.lab_4.controller.UniversityCreator;
import org.example.lab_4.model.University;
import org.example.lab_4.utils.JsonManager;

import java.io.IOException;


public class Run {
    public static void main(String[] args) throws IOException {
        String filename = "university.json";

        University university = createTypicalUniversity();

        JsonManager.saveUniversityToFile(university, filename);

        University loadedUniversity = JsonManager.loadUniversityFromFile(filename);

        System.out.println("university the same? " + university.equals(loadedUniversity));
    }

    public static University createTypicalUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();
        System.out.println("The university was established: " + university.getName());
        return university;
    }
}
