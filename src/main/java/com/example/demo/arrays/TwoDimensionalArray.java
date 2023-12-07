package com.example.demo.arrays;

public class TwoDimensionalArray {
    int arr[][] = null;

    //constructor
    public  TwoDimensionalArray(int numOfRows, int numOfColumns){
        arr = new int[numOfRows][numOfColumns];

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[0].length; column++) {
                arr[row][column] = Integer.MIN_VALUE;
                
            }
            
        }
        
    }

    //insert a value

    public void insertAvalue(int row, int col, int value){

        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("Successfully inserted values");
            } else {
                System.out.println("This cell is already occupied");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }

    }

    // Accessing cell value from given array

    public void accessCell(int row, int col) {
        System.out.println("\nAccessing Row#" + row + ", Col#" + col);
        try {
            System.out.println("cell value is" + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");

        }

    }

    // Searching a single value from the Array

    public void searchValue(int valueToSearch) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == valueToSearch) {
                    System.out.println("Value is found at row: "+ row + " Col: " + col);
                    return;

                }

            }

        }
        System.out.println("value is not foune" + valueToSearch);
    }


    // Deleting a value from Array

    public void deleteValuefromArray(int row, int col) {
        try {
            System.out.println("Successfully deleted: " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index is not valid for array");
        }
    }

}
