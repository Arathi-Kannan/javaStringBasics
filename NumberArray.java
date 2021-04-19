/*
Create an ArrayList which will be able to store only numbers like 
int, float, double, etc, but not any other data type.
 * */

package com.training.java;

import java.util.ArrayList;

class ArrayListNumbersOnly<E> extends ArrayList<E> {
    @Override
    public boolean add(E e) {
        if (e instanceof Integer || e instanceof Float || e instanceof Double) {
            super.add(e);
            return true;
        } else {
            throw new ClassCastException("Only Integer, Float, and Double are supported.");
        }
    }
}

public class NumberArray {

    public static void main(String[] args) {
        ArrayList<Object> numberArrayList = new ArrayListNumbersOnly<>();

        try {
            numberArrayList.add(100);
            numberArrayList.add(2.3F);
            numberArrayList.add(2.345D);
            numberArrayList.add("abc");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(numberArrayList);

    }

}