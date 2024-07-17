package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        computeAverageMarks();
    }

    public static void computeAverageMarks() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for Java Programming:");
        int javaProgrammingMarks = scanner.nextInt();

        System.out.println("Enter marks for Networking:");
        int networkingMarks = scanner.nextInt();

        System.out.println("Enter marks for Maths:");
        int mathsMarks = scanner.nextInt();

        double average = (javaProgrammingMarks + networkingMarks + mathsMarks) / 3.0;

        System.out.println("Marks for Java Programming: " + javaProgrammingMarks);
        System.out.println("Marks for Networking: " + networkingMarks);
        System.out.println("Marks for Maths: " + mathsMarks);
        System.out.println("The average is: " + average);
    }
}
