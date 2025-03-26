package org.example.Lab_3.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class University {
    private final String name;
    private final Human head;
    private final List<Faculty> faculties;

    public University(String name, Human head, List<Faculty> faculties) {
        this.name = name;
        this.head = head;
        this.faculties = faculties != null ? new ArrayList<>(faculties) : new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }


    public Human getHead() {
        return head;
    }


    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", head=" + head +
                ", faculties=" + faculties +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(name, that.name) && Objects.equals(head, that.head) && Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, faculties);
    }
}
