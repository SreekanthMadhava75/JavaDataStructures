package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.arrays.*;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		SingleDimensionArray sda = new SingleDimensionArray(10);
		sda.insert(10,20);
		sda.insert(1,-1000000);
		sda.insert(2,23);
		sda.insert(3,25);
		sda.insert(4,120);

		sda.traversalArray();
		sda.searchInArray(23);
		sda.deleteValueFromArray(4);
		sda.searchInArray(120);

	}



}
