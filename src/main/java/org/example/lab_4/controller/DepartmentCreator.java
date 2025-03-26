package org.example.lab_4.controller;


import org.example.lab_4.model.*;

public class DepartmentCreator {
    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }

    public Department createTypicalDepartment() {
        StudentCreator studentCreator = new StudentCreator();
        GroupCreator groupCreator = new GroupCreator();

        Student head = studentCreator.createStudent("Olga", "Ivanova", "Petrivna", Sex.FEMALE);
        Department department = createDepartment("Department of Mathematics", head);

        Group group1 = groupCreator.createTypicalGroup();
        Group group2 = groupCreator.createTypicalGroup();

        department.addGroup(group1);
        department.addGroup(group2);

        return department;
    }
}