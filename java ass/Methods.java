package java_methods;

// methods_in_java/src/java_methods/Methods.java

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        findLargestAndSmallest();
    }

    public static void findLargestAndSmallest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int smallest = Math.min(Math.min(num1, num2), num3);
        int largest = Math.max(Math.max(num1, num2), num3);

        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(largest + " is your largest and " + smallest + " is your smallest number.");
    }
}