package com.training.java;

import java.util.Vector;

public class VectorExample {

    private Vector<Integer> evenVector;
    private Vector<Integer> sumVector;

    public Vector<Integer> saveEvenNumbers(int end){
        int start = 2;
        evenVector = new Vector<>();
        for (int i=2; i<=end; i++){
            //finding even numbers and storing them in an array
            if(i%2 == 0)
                evenVector.add(i);
        }
        return evenVector;
    }

    public Vector<Integer> printEvenNumbers(){
        sumVector = new Vector<>();
        Integer sum = 0;
        if (evenVector.isEmpty())
            System.out.println("The linked list is empty");
        else{
//                evenVector.forEach((evenNumber)-> System.out.print(evenNumber * 2+", ") );
            for (Integer evenNumber:evenVector){
                //multiplying each number by 2
                System.out.print(evenNumber * 2+", ");
                //adding the numbers
                sum += (evenNumber * 2);
                sumVector.add(sum);
            }
        }
//        System.out.println();
//        System.out.println(evenVector);
//        System.out.println(sumVector);
        return sumVector;
    }

    //Search for a number. If present, return number else return 0
    public int printEvenNumber(int number){
        int answer = (evenVector.contains(number))?number:0;
        System.out.println("in PrintEvenNumber: "+answer);
        return answer;
    }

    public static void main(String args[]){
        VectorExample vectorObj = new VectorExample();
        vectorObj.saveEvenNumbers(16);
        vectorObj.printEvenNumbers();
        vectorObj.printEvenNumber(14);
    }
}
