package com.training.java;

import java.util.ArrayList;

public class CollectionExample {

    private ArrayList<Integer> evenArrayList;
    private ArrayList<Integer> sumArrayList;

    public ArrayList<Integer> saveEvenNumbers(int end){
        int start = 2;
        evenArrayList = new ArrayList<>();
        for (int i=2; i<=end; i++){
            //finding even numbers and storing them in an array
            if(i%2 == 0)
                evenArrayList.add(i);
        }
        return evenArrayList;
    }

    public ArrayList<Integer> printEvenNumbers(){
        sumArrayList = new ArrayList<>();
        Integer sum = 0;
        if (evenArrayList.isEmpty())
            System.out.println("The array list is empty");
        else{
        //    evenArrayList.forEach((evenNumber)-> System.out.print(evenNumber * 2+", ") );
          for (Integer evenNumber:evenArrayList){
              //multiplying each number by 2
              System.out.print(evenNumber * 2+", ");
              //adding the numbers
              sum += evenNumber;
              sumArrayList.add(sum);
          }
        }
//        System.out.println();
//        System.out.println(evenArrayList);
//        System.out.println(sumArrayList);
        return sumArrayList;
    }

    //Search for a number. If present, return number else return 0
    public int printEvenNumber(int number){
        int answer = (evenArrayList.contains(number))?number:0;
        System.out.println("in PrintEvenNumber: "+answer);
        return answer;
    }

    public static void main(String args[]){
        CollectionExample collExObj = new CollectionExample();
        collExObj.saveEvenNumbers(16);
        collExObj.printEvenNumbers();
        collExObj.printEvenNumber(13);
    }
}
