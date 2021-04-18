package com.training.java;

import java.util.Scanner;

public class ConsoleMenu {
    public static void main(String args[]){
        char contin = 'y';
        int input = 0;
        int num1 = 0;
        int num2 = 0;
        do {
            //try catch to catch the input mismatch exception
            try {
                System.out.println("***********USER MENU***********");
                System.out.println("\t1. Add");
                System.out.println("\t2. Sub");
                System.out.println("Please enter 1 or 2: ");
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextInt();
                //performing addition
                if (input == 1) {
                    System.out.println("Please enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.println("Please enter second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("The result is: " + (num1 + num2));
                }
                //Performing subtraction
                else if (input == 2) {
                    System.out.println("Please enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.println("Please enter second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("The result is: " + (num1 - num2));
                }
                System.out.println("Do you want to conitnue?(y or n): ");
                contin = scanner.next().charAt(0);
            }catch (Exception e) {
                System.out.println("Invalid input: q"+e.getMessage());
            }
        } while(contin == 'y');
    }
}
