package com.java8.features.lambda;

public class LambdaExpression2 {

    public static void main(String[] args) {

        FuncInterface1 f1=x-> System.out.println(2*x);

        f1.abstractfunc1(7);
    }
}
