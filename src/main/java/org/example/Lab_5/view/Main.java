package org.example.Lab_5.view;

import org.example.Lab_5.controller.StudentController;
import org.example.Lab_5.model.Student;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Show all students");
            System.out.println("2. Display students by birth month");
            System.out.println("3. Close");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    List<Student> allStudents = controller.fetchAllStudents();
                    allStudents.forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Enter the month number (1-12): ");
                    int month = scanner.nextInt();
                    List<Student> studentsByMonth = controller.fetchStudentsByMonth(month);
                    studentsByMonth.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Close...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Incorrect choice. Try again..");
            }
        }
    }
}
