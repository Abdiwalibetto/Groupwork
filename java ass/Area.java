package com.myproject;

import java.util.Scanner;

public class Area {
     public static void main(String[] args) {
        Area areaCalculator = new Area();
        double base = areaCalculator.inputBase();
        double height = areaCalculator.inputHeight();
        double triangleArea = areaCalculator.calculateTriangleArea(base, height);
        areaCalculator.displayTriangleArea(triangleArea);
    }

    public double inputBase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        return base;
    }

    public double inputHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        return height;
    }

    public double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public void displayTriangleArea(double triangleArea) {
        System.out.println("The area of the triangle is: " + triangleArea);
    }
}

