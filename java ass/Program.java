import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step a)
        int[] array = new int[15];
        System.out.println("Enter 15 values:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Values stored in the array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Step b)
        System.out.print("Enter a number to search: ");
        int searchNumber = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                System.out.println("Number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array");
        }

        // Step c)
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        System.out.println("Elements of the new array (in reverse order):");
        for (int value : reverseArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Step d)
        int sum = 0;
        int product = 1;
        for (int value : array) {
            sum += value;
            product *= value;
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}
