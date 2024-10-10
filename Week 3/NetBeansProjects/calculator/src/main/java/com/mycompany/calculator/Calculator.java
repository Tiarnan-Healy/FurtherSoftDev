/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
// https://github.com/Tiarnan-Healy/CalculatorJava.git
package com.mycompany.calculator;
import java.util.Scanner;

/**
 *
 * @author aws.admin
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        String choice = "";

        num1 = inputFirstNum(num1, scanner);
        num2 = inputSecondNum(num2, scanner);
        menu(scanner, num1, num2);
    }

    // Input method
    public static double inputFirstNum(double num1, Scanner scanner) {
        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();
        return num1;
    }

    public static double inputSecondNum(double num2, Scanner scanner) {
        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();
        return num2;
    }

    // Addition method 
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction method
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    // Division method
    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    // Multiplication method
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    // Quit method
    public static void quit() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    // Print method
    public static void print(double answer) {
        System.out.println(answer);
    }

    // Menu method
    public static void menu(Scanner scanner, double num1, double num2){
        while (true) {
            System.out.println("Please select an option:\n");
            System.out.println("Addition\t\t\t(1)");
            System.out.println("Subtraction\t\t\t(2)");
            System.out.println("Multiplication\t\t(3)");
            System.out.println("Division\t\t\t(4)");
            System.out.println("Quit\t\t\t\t(5)");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    print(addition(num1, num2));
                    break;
                case 2:
                    print(subtraction(num1, num2));
                    break;
                case 3:
                    print(multiplication(num1, num2));
                    break;
                case 4:
                    print(division(num1, num2));
                    break;
                case 5:
                    quit();
                    System.exit(0);
            }
        }
    }
}