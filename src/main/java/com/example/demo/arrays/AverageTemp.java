package com.example.demo.arrays;

import java.util.*;

public class AverageTemp {

    public AverageTemp() {
    }

    public void temp() {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int numDays = console.nextInt();
        int[] temps = new int[numDays];
        // record temperatures and find average
        int sum = 0;
//        for (int i = 1; i <= numDays ; i++) {
//            System.out.print("Day " + i + "'s high temp: ");
//            int next = console.nextInt();
//            sum += next;
//        }
        for (int i = 0; i < numDays; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = console.nextInt();
            sum += temps[i];
        }

        double average = sum / numDays;
        System.out.println("average Temp  " + average);

        int above = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > average) {
                above++;
                System.out.println(temps[i]);

            }
        }

        System.out.println(above + "days above avg");

    }

}
