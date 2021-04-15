package com.training.java;

public class Assignments extends MethodsAssignment{

    public static void main(String[] args){
        //creating an object to access the methods in the child class
        Assignments assignmentObj = new Assignments();

        //to check if the number is positive, negative or zero
        assignmentObj.checkIntegerSign(0);

        //to check if  number is even or odd
        assignmentObj.checkEvenOdd(6);

        //method to check command line input arguments
        assignmentObj.checkCommandLindInput(args);

        //Sorting characters by alphabetical order
        assignmentObj.sortCharAlphabetical();

        //checking if the character is alphabet, digit, or special character
        assignmentObj.checkAlphbtDgtSp();

        //calculating % of interest after receiving command line args
        assignmentObj.calculatePercentInterest();

        //converting the case of the alphabet
        assignmentObj.convertCase();

        //printing color name based on color code
        assignmentObj.printColorCode();

        //printing the month in words
        assignmentObj.monthInWords();

        //print numbers in a row with tab spacing
        assignmentObj.printNumbersInRow();

        //print even numbers between 23 and 57
        assignmentObj.printEven23_57();

        //to check if a given number is prime or not
        assignmentObj.checkPrime(3);

        //to print all prime numbers between 10 and 99
        assignmentObj.checkPrime10_99(10,99);

        //to find the sum of each digit of the number
        assignmentObj.calculateSumDigits(15678);

        //to print * using Flyod's Pattern
        assignmentObj.floydsPattern(9);

        //number reversal
        assignmentObj.numberReversal(6789);

        //palindrome check
        assignmentObj.palindromeCheck(151);

        //first 5 numbers divisible by 2,3,5
        assignmentObj.numbersDivisibleBy2_3_5(1);

    }

}
