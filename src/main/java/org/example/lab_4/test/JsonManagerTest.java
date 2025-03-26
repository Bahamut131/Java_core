package org.example.lab_4.test;

import org.example.lab_4.controller.UniversityCreator;
import org.example.lab_4.model.University;
import org.example.lab_4.utils.JsonManager;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonManagerTest {
    private static final String FILE_NAME = "test_university.json";

    @Test
    public void testJsonSerialization() throws IOException {
        University oldUniversity = createTestUniversity();

        JsonManager.saveUniversityToFile(oldUniversity, FILE_NAME);

        University newUniversity = JsonManager.loadUniversityFromFile(FILE_NAME);

        assertEquals(oldUniversity.toString(), newUniversity.toString());
        assertEquals(oldUniversity, newUniversity);
    }

    private University createTestUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();
        System.out.println("The university was established: " + university.getName());
        return university;
    }
}