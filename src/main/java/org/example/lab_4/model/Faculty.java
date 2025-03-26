package org.example.lab_4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty {
    private final String name;
    private final Human head;
    private final List<Department> departments;

    public Faculty(String name, Human head) {
        this.name = name;
        this.head = head;
        this.departments = new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }



    public Human getHead() {
        return head;
    }



    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", head=" + head +
                ", departments=" + departments +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(name, faculty.name) && Objects.equals(head, faculty.head) && Objects.equals(departments, faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, departments);
    }
}

