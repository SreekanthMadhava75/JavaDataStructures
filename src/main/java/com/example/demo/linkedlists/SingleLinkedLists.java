package com.example.demo.linkedlists;

public class SingleLinkedLists {
    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int nodeValue) {
        //head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert Method SinglyLinkedList

    // Insert Method SinglyLinkedList
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSingleLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }


    // SinglyLinkedList Traversal
    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("SLL does not exist!");
        } else {
            Node tempNode = head;
            for (int i = 0; i<size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }


    public boolean searchNode(int nodeValue) {
        Node tempNode = head;
        if (head != null) {
            for (int i = 0; i < size; i++) {
                if (nodeValue == tempNode.value) {
                    System.out.print("Found the node at location: " +i+"\n");
                    return true;
                }

                tempNode = tempNode.next;

            }
        }
        System.out.println("Node not found");
        return  false;
    }

    //Deleting a node from SinglyLinkedList

    public void deleteNode(int location){
        if (head == null) {
            System.out.println("The CSLL does not exist! ");
            return;
        } else if (location == 0) {
            // delete first node if we have only one node
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;

            }

        } else if (location >= size) {
            //delete last node
            Node tempNode = head;
            for (int i = 0; i < size-1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head){
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;

        } else {
            Node tempnode = head;
            for (int i = 0; i < location-1; i++) {
                tempnode = tempnode.next;
            }
            tempnode.next = tempnode.next.next;
            size--;
        }
    }

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
