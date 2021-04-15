package com.training.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class MethodsAssignment{

    private static int noOfPrimes = 0;
    private static int count = 0;
    private static int original = 0;
    private static JLabel text;

    //method to check if a given number is positive or negative or zero
    public void checkIntegerSign(Integer toBeChecked){
        String answer = (toBeChecked == 0)?" zero":(toBeChecked > 0)?" positive":" negative";
        System.out.println("The number "+ toBeChecked +" is "+answer);
    }

    //Method to check if given number is odd or even
    public void checkEvenOdd(double toBeChecked){
        String answer = (toBeChecked%2 == 0)?" even":" odd";
        System.out.println("The number "+toBeChecked+answer);
    }

    //Method to check command line arguments and print them with comma
    public void checkCommandLindInput(String[] args){
        if (args.length == 0)
            System.out.println("No values");
        else {

           /* Consumer<String> conMethod = (a) -> {
                System.out.print(a + " , ");
            };
            ArrayList<String> inputArgs = new ArrayList<String>();
            */
            //Iterating through the arguments and separating each with comma
            for (String arg : args) {
                // inputArgs.add(args[i]);
                System.out.print(arg + ", ");
            }
            System.out.println();
           // inputArgs.forEach(conMethod);
        }
    }

    //Sorting characters by alphabetical order using Arrays.sort() method
    public void sortCharAlphabetical(){
        char first = 'z';
        char next = 'A';
        char[] toBeSorted = {first,next};
        System.out.print("Before sorting : ");
        System.out.println(toBeSorted[0] +", "+toBeSorted[1]);
        Arrays.sort(toBeSorted);
        System.out.print("After sorting : ");
        System.out.println(toBeSorted[0]+", "+toBeSorted[1]);
    }

    //checking if the character is alphabet, digit, or special character
    public void checkAlphbtDgtSp(){
    char check = '-';
    String result = Character.isAlphabetic(check)?"Alphabet":"Unknown";
    if (result.equals("Unknown")){
        result = Character.isDigit(check)?"Digit":"Special Character";
    }
    System.out.println("The character "+check+" is "+result);
    }

    //calculate % interest based on inputs from command line
    public void calculatePercentInterest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Male(M) or Female(F): ");
        char gender = scanner.next().charAt(0);
        System.out.println("Enter age (1-120): ");
        int age = scanner.nextInt();
        double interest = 0.0;
//      System.out.println(gender);
//      System.out.println(age);
        if (gender == 'F' || gender == 'f'){
            interest = (age>=1 && age<=58)?8.2:(age >=59 && age<=120)?7.6:0.0;
        }
        if (gender == 'M' || gender == 'm'){
            interest = (age>=1 && age<=60)?9.2:(age >=61 && age<=120)?8.3:0.0;
        }

        System.out.println(interest);
    }

    //method to convert the case of an alphabet
    public void convertCase(){
        char input = 'P';
        //checking the case and converting to the one that it is not
        char output = Character.isLowerCase(input)?Character.toUpperCase(input):Character.toLowerCase(input);
        System.out.println("Converting the case of: "+input+"->"+output);
    }

    public void printColorCode(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a color code (r,g,y,b,w): ");
        char code = scanner.next().charAt(0);
        switch (code){
            case 'r':
                System.out.println("r->Red");
                break;
            case 'R':
                System.out.println("R->Red");
                break;
            case 'g':
                System.out.println("g->Green");
                break;
            case 'G':
                System.out.println("G->Green");
                break;
            case 'b':
                System.out.println("b->Blue");
                break;
            case 'B':
                System.out.println("B->Blue");
                break;
            case 'o':
                System.out.println("o->Orange");
                break;
            case 'O':
                System.out.println("O->Orange");
                break;
            case 'y':
                System.out.println("y->Yellow");
                break;
            case 'Y':
                System.out.println("Y->Yellow");
                break;
            case 'w':
                System.out.println("w->White");
                break;
            case 'W':
                System.out.println("W->White");
                break;
            default:
                System.out.println("Invalid Code");
        }
    }

//print month in words based on input in number
    public void monthInWords(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month in number: ");
        int month = scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
        }
    }

//print numbers from 1 to 10 in a single row with tab space
    public void printNumbersInRow(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println("Printing numbers 1 to 10 in a row separated by tab");
        numbers.forEach((number)-> System.out.print(number + "\t"));
        System.out.println();
    }

    //printing even numbers between 23 and 57 in a separate row
    public void printEven23_57() {
        int start = 23;
        int end = 57;
        int index = start;
        System.out.println("printing even numbers between 23 and 57 in a separate row");
        while (index <= end) {
            if (index % 2 == 0)
                System.out.print(index + "\t");
            index++;
        }
        System.out.println();
    }

    public void checkPrime(int input){
        int start = 2;
        boolean isPrime = false;
        if(start == input)
            isPrime = true;
        while (start<input){
            //checking if number is divisible by each number starting from 2
            if (input%start==0){
                isPrime = false;
                break;
            } else {
                isPrime = true;
           }
            start++;
        }
        if (isPrime)
            System.out.println("The number: "+input+" is a prime number.");
        else
            System.out.println("The number: "+input+" is not a prime number.");
    }

// 13. print prime numbers between 10 and 99
public void checkPrime10_99(int start, int end) {
    count++;
    if(count ==1){
        original = start;
    }
    if (start == end){
        System.out.println(noOfPrimes + " prime numbers between "+original + " and "+end);
        return;
    }
    int divide = 2;
    boolean isPrime = false;
    while (divide < start) {
        //checking if number is divisible by each number starting from 2
        if (start % divide == 0) {
            isPrime = false;
            break;
        } else {
            isPrime = true;
        }
        divide++;
    }
    if (isPrime) {
        System.out.println("The number: " + start + " is a prime number.");
        noOfPrimes++;
    }
    if (start == 0 || start ==1)
        start = 2;
    start++;
    if (divide < start) {
        checkPrime10_99(start, end);
    }
    }

    //to add digits of the number
    public void calculateSumDigits(Integer input){
        String inputString = input.toString();
        int sum = 0;
        for(int i = 0; i<inputString.length(); i++){
            //extracting each digit and converting it to string
            String a  =  Character.toString((inputString.charAt(i)));
            //converting it to int and adding each digit
            sum = sum + Integer.parseInt(a);
        }
        System.out.println("The sum of digits of "+input+" is "+sum);
    }

    //printing  * in floyds triangle
    public void floydsPattern(int input){
        for (int j = 0; j<input;j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    //to reverse a given number
    public void numberReversal(Integer input){
        String inputString = input.toString();
        String result = "";
        for(int i = inputString.length()-1; i>=0; i--) {
            //extracting each digit from the string
            result = result + Character.toString((inputString.charAt(i)));
        }
        System.out.println("The number "+input + " is reversed as "+ result);
    }

    //To check if a number is palindrome or not
    public void palindromeCheck(Integer input){
        String inputString = input.toString();
        String result = "";
        for(int i = inputString.length()-1; i>=0; i--) {
            //extracting each digit from the string
            result = result + Character.toString((inputString.charAt(i)));
        }
        if (inputString.equals(result)){
            System.out.println("The number "+ input + " is a palindrome." );
        } else
            System.out.println("The number "+ input + " is not a palindrome." );
    }

    //print first 5 values that are divisible by 2,3,and 5
    public void numbersDivisibleBy2_3_5(int startingNumber){
        int count = 0;
        while (count<5){
            if((startingNumber % 2 == 0) && (startingNumber % 3 == 0) && (startingNumber % 5 == 0)) {
                System.out.println(startingNumber +" is divisible by 2, 3, and 5.");
                count++;
            }
            startingNumber++;
        }
    }


}


