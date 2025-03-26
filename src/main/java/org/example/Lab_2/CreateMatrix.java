package org.example.Lab_2;

import java.util.Random;
import java.util.Scanner;

public class CreateMatrix {
    private final Scanner scanner = new Scanner(System.in);
    private int[][] matrix;
    private final Random random = new Random();

    public void startMenu() {
        System.out.println("Enter the length and width of the desired matrix:");
        System.out.println("____________________________________________");
        while (true) {
            System.out.println("Висота: ");
            int height = scanner.nextInt();
            System.out.println("Довжина: ");
            int width = scanner.nextInt();
            if (height > 20 || width > 20) {
                System.out.println("Enter a matrix size of maximum 20x20: ");
                System.out.println("____________________________________________");
            } else {
                createMatrix(height, width);
                break;
            }
        }

    }

    private void createMatrix(int height, int width) {
        matrix = new int[height][width];
        System.out.println("Please choose how you want to fill in the matrix. \n" +
                "1) Manually \n" +
                "2) Randomly fill the matrix");

        while (scanner.hasNextInt()) {
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    fillMatrixManually(scanner, matrix);
                    break;
                case 2:
                    fillMatrixRandomly(random, matrix);
                    break;
                default:
                    System.out.println("Invalid input, enter 1 or 2: ");
                    continue;
            }
            break;
        }

        printMatrix(matrix);
        endMenu();

    }

    private static void fillMatrixManually(Scanner scanner, int[][] matrix) {
        System.out.println("Enter the matrix elements:");
        System.out.println("____________________________________________");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                while (true) {
                    System.out.printf("Enter an item [%d][%d]: ", i, j);
                    if (scanner.hasNextInt()) {
                        matrix[i][j] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Error! Please enter a whole number.");
                        scanner.next();
                    }
                }
            }
        }
    }

    private static void fillMatrixRandomly(Random random, int[][] matrix) {
        System.out.println("The matrix is filled with random integers:");
        System.out.println("____________________________________________");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("____________________________________________");
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
        System.out.println("____________________________________________");
    }

    private void endMenu() {

        while (true) {
            System.out.println("Operations on the created matrix: \n" +
                    "1)Find the maximum and minimum value of a matrix: 1\n" +
                    "2)Find the arithmetic mean of a matrix: 2\n" +
                    "3)Create another matrix:3\n" +
                    "4)Exit the program: 4");

            while (!scanner.hasNextInt()){
                System.out.println("Enter a valid number!\n");
                scanner.next();
            }

            int userChoose = scanner.nextInt();
            switch (userChoose) {
                case 1:
                    findMinMax(matrix);
                    break;
                case 2:
                    calculateAverage(matrix);
                    break;
                case 3:
                    startMenu();
                    return;
                case 4:
                    System.out.println("The program is complete.");
                    return;
                default:
                    System.out.println("Please enter a valid value!");
            }
        }
    }


    private static void findMinMax(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < min) min = num;
                if (num > max) max = num;
            }
        }
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }

    private static void calculateAverage(int[][] matrix) {
        int sum = 0, count = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.printf("Arithmetic average: %.2f%n", average);
    }

}