package com.example;
import java.util.Scanner;

public class TempConvRefactored {

// constants for menu
    private static final int C_To_F = 1;
    private static final int F_To_C = 2;
    private static final int C_To_K = 3;
    private static final int EXIT = 4;


    public static double CelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double FahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double CelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Display menu
    private static void displayMenu() {
        System.out.println("\n--- Temperature Conversion Menu ---");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.println("3. Convert Celsius to Kelvin");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4): ");
    }

    // Read a valid double from user
    private static double readTemperature(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next(); // discard invalid input
            }
        }
    }

    // Read a valid menu choice
    private static int readMenuChoice(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice >= C_To_F && choice <= EXIT) {
                    return choice;
                }
            } else {
                scanner.next(); // discard invalid input
            }
            System.out.print("Invalid choice. Please enter a number between 1 and 4: ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Temperature Conversion App!");

        boolean running = true;
        while (running) {
            displayMenu();
            int choice = readMenuChoice(scanner);

            switch (choice) {
                case C_To_F:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = readTemperature(scanner);
                    System.out.println("Result: " + CelsiusToFahrenheit(celsius) + " °F");
                    break;
                case F_To_C:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = readTemperature(scanner);
                    System.out.println("Result: " + FahrenheitToCelsius(fahrenheit) + " °C");
                    break;
                case C_To_K:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsiusK = readTemperature(scanner);
                    System.out.println("Result: " + CelsiusToKelvin(celsiusK) + " K");
                    break;
                case EXIT:
                    System.out.println("Thank you!");
                    running = false;
                    break;
            }
        }

        scanner.close();
    }
}