package com.example.demo.arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraysList {
    public ArraysList(){}

    public void listLoop(){
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("a");
        stringArrayList.add("b");
        stringArrayList.add("c");
        stringArrayList.add("d");
        stringArrayList.add("e");
        stringArrayList.add("f");

        for (int i = 0; i < stringArrayList.size(); i++) {
            String letter = stringArrayList.get(i);
            System.out.println(letter);

        }

        for (String letters: stringArrayList) {
            System.out.println(letters);
        }

        Iterator<String> iterator = stringArrayList.iterator();
        while (iterator.hasNext()){
            String let = iterator.next();
            System.out.println("asadfg"+let);
        }




    }

}
