package com.java8.features.forEach;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
       // Using lambda expression to print all elements
        arrL.forEach(n->System.out.println(n));
       // arrL.forEach(System.out::println);

        // Using lambda expression to print even elements
        arrL.forEach( n->{
            if(n%2==0)
                System.out.println(n);
        });
    }
}
