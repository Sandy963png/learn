package code;

import java.util.Scanner;

public class Calculator {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();

        while (true) {

            System.out.println();
            System.out.println("================================");
            System.out.println("        CALCULATOR APP");
            System.out.println("================================");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            // Exit
            if (choice == 5) {
                System.out.println("Thank you for using Calculator!");
                break;
            }

            // Check valid choice
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice!");
                continue;
            }

            // Get numbers from user
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            try {

                double result;

                switch (choice) {

                    case 1:
                        result = calculator.add(num1, num2);
                        System.out.println("Result = " + result);
                        break;

                    case 2:
                        result = calculator.subtract(num1, num2);
                        System.out.println("Result = " + result);
                        break;

                    case 3:
                        result = calculator.multiply(num1, num2);
                        System.out.println("Result = " + result);
                        break;

                    case 4:
                        result = calculator.divide(num1, num2);
                        System.out.println("Result = " + result);
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (ArithmeticException e) {

                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}