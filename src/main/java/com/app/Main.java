package com.app;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 10;
        int b = 5;
        System.out.println("Addition : " + calc.add(a, b));
        System.out.println("Soustraction : " + calc.subtract(a, b));
        System.out.println("Multiplication : " + calc.multiply(a, b));
        System.out.println("Division : " + calc.divide(a, b));
    }
}
