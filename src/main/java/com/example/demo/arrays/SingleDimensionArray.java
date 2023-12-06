package com.example.demo.arrays;

import  java.util.Arrays;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = Integer.MIN_VALUE;


        }

    }

    public void  insert(int location, int valueToBeInserted){

        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }

    }

//    Array travrersal
    public  void traversalArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        }catch (Exception e){
            System.out.println("Array no longer exists!");
        }

    }

    public void searchInArray(int valueSearch){

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == valueSearch) {
                System.out.println("hiii");
            }
        }
    }

}
