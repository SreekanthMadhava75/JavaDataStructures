package com.example.demo.stack;


import com.example.demo.linkedlists.Node;
import com.example.demo.linkedlists.SingleLinkedLists;

public class StackLinkedList {
    SingleLinkedLists singleLinkedLists;
    Node node;


    public StackLinkedList(){
        singleLinkedLists = new SingleLinkedLists();
    }

    public void push(int value){
        singleLinkedLists.insertInLinkedList(10,0);
        System.out.println("Inserted " + value + " in Stack");
    }

    public boolean isEmpty(){
        if (singleLinkedLists.head == null) {
            System.out.println("stack is empty");
            return true;
        } else {
            return false;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("the stack is empty");
        } else {
            singleLinkedLists.deleteNode(0);
        }
        return -1;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("the stack is emptyyyyyyyyyy");
            return -1;
        } else {
            return singleLinkedLists.head.value;
        }
    }

    // Delete Method
    public void deleteStack() {
        singleLinkedLists.head = null;
        System.out.println("The Stack is deleted");
    }

}
