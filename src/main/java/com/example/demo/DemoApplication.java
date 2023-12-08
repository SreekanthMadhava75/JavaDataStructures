package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.arrays.*;


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

		AverageTemp at = new AverageTemp();
		at.temp();
	}



}
