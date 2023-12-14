package com.example.demo.stack;

public class StackArray {
    int[] arr;
    int topOfStack;

    public StackArray(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
    }

    // isEmpty
    public boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        } else {
            return false;
        }
    }

    //isFull
    public boolean isFull(){
        if (topOfStack == arr.length - 1){
            System.out.println("stack is full");
            return true;
        } else {
            return false;
        }
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("the stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value imserted successfully");
        }
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        } else {
            System.out.println(arr[topOfStack]);
            return arr[topOfStack];
        }
    }

    public void deleteStack(){
        arr = null;
        System.out.println("stack is delerted");
    }
}
