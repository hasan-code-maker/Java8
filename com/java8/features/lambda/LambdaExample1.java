package com.java8.features.lambda;

public class LambdaExample1 {

    public static void main(String[] args) {

        // Using lambda expressions to define the operations
        FuncInterface add=(a, b)->a+b;
        FuncInterface sub=(a, b)->a-b;
        FuncInterface mul=(a, b)->a*b;
        FuncInterface div=(a, b)->a/b;


        System.out.println(add.operation(10,10)); //output 20
        System.out.println(sub.operation(10,8)); //output 2
        System.out.println(mul.operation(10,8)); //output 80
        System.out.println(div.operation(10,8)); //output 1
    }
}
