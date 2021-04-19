package com.training.java;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

    private LinkedList<Integer> evenLinkedList;
    private LinkedList<Integer> sumLinkedList;

    public LinkedList<Integer> saveEvenNumbers(int end){
        int start = 2;
        evenLinkedList = new LinkedList<>();
        for (int i=2; i<=end; i++){
            //finding even numbers and storing them in an array
            if(i%2 == 0)
                evenLinkedList.add(i);
        }
        return evenLinkedList;
    }

    public LinkedList<Integer> printEvenNumbers(){
        sumLinkedList = new LinkedList<>();
        Integer sum = 0;
        if (evenLinkedList.isEmpty())
            System.out.println("The linked list is empty");
        else{
            //    evenArrayList.forEach((evenNumber)-> System.out.print(evenNumber * 2+", ") );
            for (Integer evenNumber:evenLinkedList){
                //multiplying each number by 2
                System.out.print(evenNumber * 2+", ");
                //adding the numbers
                sum += (evenNumber * 2);
                sumLinkedList.add(sum);
            }
        }
//        System.out.println();
//        System.out.println(evenLinkedList);
//        System.out.println(sumLinkedList);
        return sumLinkedList;
    }

    //Search for a number. If present, return number else return 0
    public int printEvenNumber(int number){
        int answer = (evenLinkedList.contains(number))?number:0;
        System.out.println("in PrintEvenNumber: "+answer);
        return answer;
    }

    public static void main(String args[]){
        LinkedListExample llObj = new LinkedListExample();
        llObj.saveEvenNumbers(16);
        llObj.printEvenNumbers();
        llObj.printEvenNumber(13);
    }
}
