package org.example.Lab_3.controller;


import org.example.Lab_3.model.Group;
import org.example.Lab_3.model.Human;
import org.example.Lab_3.model.Sex;
import org.example.Lab_3.model.Student;

public class GroupCreator {
    public Group createGroup(String name, Human head) {
        return new Group(name, head);
    }

    public Group createTypicalGroup() {
        StudentCreator studentCreator = new StudentCreator();

        Student head = studentCreator.createStudent("Ivan", "Petrenko", "Olexandrovich", Sex.MALE);
        Group group = createGroup("Group 101", head);

        Student student1 = studentCreator.createStudent("Olena", "Sydorenko", "Ihorivna", Sex.FEMALE);
        Student student2 = studentCreator.createStudent("Mykhailo", "Kovalenko", "Viktorovich", Sex.MALE);

        group.addStudent(student1);
        group.addStudent(student2);

        return group;
    }
}

