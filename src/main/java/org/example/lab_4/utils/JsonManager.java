package org.example.lab_4.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.lab_4.model.Human;
import org.example.lab_4.model.University;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting()
            .registerTypeAdapter(Human.class, new HumanAdapter())
            .create();

    public static void saveUniversityToFile(University university, String fileName) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(university, writer);
        }
    }

    public static University loadUniversityFromFile(String fileName) throws IOException {
        try (FileReader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, University.class);
        }
    }
}
