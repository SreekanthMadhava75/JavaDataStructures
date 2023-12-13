package com.example.demo.circularDoubleLinkedList;

public class CircularDoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    public DoublyNode createCDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        node.next = node;
        node.prev = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertNode(int nodeValue, int location){
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        if (head == null) {
            createCDLL(nodeValue);
        } else if (location == 0) {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            head = node;
        } else if (location >= size) {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            tail = node;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location-1) {
                    tempNode = tempNode.next;
                    index++;
            }
            node.prev = tempNode;
            node.next = tempNode.next;
            tempNode.next = node;
            node.next.prev = node;
        }
        size++;
    }
    // Traverse CDLL
    public void traverseCDLL() {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i=0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The CDLL does not exist.");
        }
        System.out.println();
    }

    // Reverse Traversal
    public void reverseTraversalCDLL() {
        if (head != null) {
            DoublyNode tempNode = tail;
            for (int i=0; i<size; i++) {
                System.out.print(tempNode.value);
                if (i != size-1) {
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }

        } else {
            System.out.println("The CDLL does not exist!");
        }
    }

    // Search for a Node
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("The node is found at location: "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found! ");
        return false;
    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CDLL does not exist!");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head.prev = null;
                head.next = null;
                head = tail= null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        } else if (location >= size) {
            if (size==1) {
                head.prev = null;
                head.next = null;
                head = tail= null;
                size--;
                return;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
            }
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < size-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }

    }

    // Delete Entire CDLL
    public void deleteCDLL() {
        DoublyNode tempNode = head;
        for (int i=0; i<size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The CDLL has been deleted!");
    }
}
