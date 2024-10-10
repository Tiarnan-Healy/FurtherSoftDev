/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author aws.admin
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        //System.out.println(message);
        double num1, num2;
        System.out.println("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        num2 = scanner.nextInt();
        
        for (int i = 1; i <= 5; i++) {
            String message = ("Loop" + i);
            System.out.println(message);
            System.out.println(num1 + num2);
            
        int j = 0;
            do {
                System.out.println("Do-While loop: j = " + j++);
            } while (j < 5);
        }
    }
}
