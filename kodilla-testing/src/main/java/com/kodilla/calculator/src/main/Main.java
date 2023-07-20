package com.kodilla.calculator.src.main;


public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int a = 5;
        int b = 10;
        int result = c.add(a, b);
        int result1 = c.subtract(a, b);
        int result2 = c.subtract1(a, b);
        System.out.println( a + "+" + b + "=" + result);
        System.out.println( a + "-" + b + "=" +result1);
        System.out.println( b + "-" + a + "=" +result2);

    }
}
