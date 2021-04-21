package com.training.java;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEmployee {

    public static void main(String args[]){
        Employee emp1 =  new Employee(1,"Mogambo","mog@gam.gom",'M', 10.0F);
        Employee emp2 =  new Employee(2,"Zogambo","zog@gam.gom",'M', 10.0F);
        Employee emp3 =  new Employee(3,"Bogambo","bog@gam.gom",'M', 10.0F);

        //Creating a vector to store employee objects
        Vector<Employee> empVector = new Vector<>();
        empVector.add(emp1);
        empVector.add(emp2);
        empVector.add(emp3);

        System.out.println("Using Enumeration:");
        //Using Enumeration to iterate through the objects in the employee Vector
        Enumeration<Employee> empEnum = empVector.elements();
        while (empEnum.hasMoreElements()){
           empEnum.nextElement().getEmployeeDetails();
        }

        System.out.println("Using Iterator:");
        //Using Iterator to iterate through the objects in the employee Vector
        Iterator<Employee> empIterator = empVector.iterator();
        while (empIterator.hasNext()){
            empIterator.next().getEmployeeDetails();
        }

    }
}
