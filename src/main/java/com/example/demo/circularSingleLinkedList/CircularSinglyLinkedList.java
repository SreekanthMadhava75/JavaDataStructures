package com.example.demo.circularSingleLinkedList;

public class CircularSinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertCSLL(int location, int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCSLL(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location-1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    // Traversal cSLL
    public void traverseCSLL() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.println(tempNode.value);
                if (i != size-1) {
                    System.out.println("->");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        } else {
            System.out.println("\nCSLL does not exist!");
        }

    }

    // search node in CSLL

    public boolean searchNode(int nodevalue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodevalue){
                    System.out.print("Found node at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    // delete node inCSLL

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CSLL does not exist! ");
            return;
        } else if (location == 0) {
            //if we have more than one node if we want delete at the begining
            head = head.next;
            tail.next = head;
            size--;
            //if we only one node
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= 0) {
            Node tempNode = head;
            for (int i = 0; i < size-1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
            return;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location-1; i++) {
                tempNode = tempNode.next;
            }

            tempNode.next = tempNode.next.next;
            size--;
        }

    }

    // Delete CSLL
    public void deleteCSLL() {
        if (head == null) {
            System.out.println("The CSLL does not exist!");
        } else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The CSLL has been deleted!");
        }
    }

}
