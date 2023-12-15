import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Enter two numbers:");

        // Input first number
        System.out.print("Number 1: ");
        double num1 = scanner.nextDouble();

        // Input second number
        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();

        // Perform operations
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + divide(num1, num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 4.");
        }

        scanner.close();
    }

    // Addition
    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction
    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication
    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division
    private static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
