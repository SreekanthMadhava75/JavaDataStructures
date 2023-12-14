package com.example.demo;

import com.example.demo.circularDoubleLinkedList.CircularDoublyLinkedList;
import com.example.demo.circularSingleLinkedList.CircularSinglyLinkedList;
import com.example.demo.doubleLinkedList.DoublyLinkedList;
import com.example.demo.stack.StackArray;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.arrays.*;
import com.example.demo.linkedlists.*;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		SingleDimensionArray sda = new SingleDimensionArray(10);
//		sda.insert(10,20);
//		sda.insert(1,-1000000);
//		sda.insert(2,23);
//		sda.insert(3,25);
//		sda.insert(4,120);
//
//		sda.traversalArray();
//		sda.searchInArray(23);
//		sda.deleteValueFromArray(4);
//		sda.searchInArray(120);

		// TwoDimensional Array

//		TwoDimensionalArray tda = new TwoDimensionalArray(2,2);
//		tda.insertAvalue(1,1,20);
//		tda.insertAvalue(3,3,21);
//
//		tda.accessCell(1,1);
//		tda.searchValue(20);
//		tda.deleteValuefromArray(2,2);
//		tda.searchValue(21);

//		AverageTemp at = new AverageTemp();
//		at.temp();

//		ArraysList al = new ArraysList();
//		al.listLoop();

//     singlelinkedlist

//		SingleLinkedLists singleLinkedLists = new SingleLinkedLists();
//		singleLinkedLists.createSingleLinkedList(5);
//		System.out.println(singleLinkedLists.head.value);
//		singleLinkedLists.insertInLinkedList(6, 1);
//		System.out.println(singleLinkedLists.head.next.value);
//		singleLinkedLists.insertInLinkedList(7, 3);
//		System.out.println(singleLinkedLists.head.next.next.value);
//
//		singleLinkedLists.insertInLinkedList(8, 4);
//		System.out.println(singleLinkedLists.head.next.next.next.value);
//
//		singleLinkedLists.insertInLinkedList(9, 3);
//		System.out.println(singleLinkedLists.head.next.next.next.value);
//
//		singleLinkedLists.traverseSinglyLinkedList();
//
//		singleLinkedLists.searchNode(6);
//		singleLinkedLists.deleteNode(3);
//		singleLinkedLists.traverseSinglyLinkedList();

		//CSLL

//		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
//		circularSinglyLinkedList.createCSLL(5);
//		//System.out.println(circularSinglyLinkedList.head.value);
//		circularSinglyLinkedList.insertCSLL(4, 0);
//		circularSinglyLinkedList.insertCSLL(6, 1);
//		circularSinglyLinkedList.insertCSLL(7, 8);
//		circularSinglyLinkedList.traverseCSLL();
//		circularSinglyLinkedList.deleteNode(6);
//		circularSinglyLinkedList.traverseCSLL();



		//DLL

//		DoublyLinkedList dll = new DoublyLinkedList();
//		dll.createDLL(1);
//		dll.insertDLL(2, 0);
//		dll.insertDLL(3, 1);
//		dll.insertDLL(4, 7);
//		dll.traverseDLL();
//		//dll.deleteDLL();
//		dll.traverseDLL();

//		CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
//		cdll.createCDLL(1);
//		cdll.insertNode(2, 0);
//		cdll.insertNode(3, 2);
//		cdll.insertNode(4, 5);
//		cdll.traverseCDLL();
//		cdll.deleteCDLL();
//		cdll.traverseCDLL();

		//stackarr
		StackArray stackArray = new StackArray(2);
		stackArray.isEmpty();
		stackArray.isFull();
		stackArray.push(2);;
		stackArray.push(3);
		stackArray.push(4);
		stackArray.isFull();
		stackArray.peek();
		stackArray.pop();
		stackArray.deleteStack();
	}



}
