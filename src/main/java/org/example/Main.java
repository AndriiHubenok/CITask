package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Long a = 5L;
        Long b = 2L;
        System.out.println("Result of add" + a + "+" + b + "is");
        System.out.println(calculator.add(a, b));
        System.out.println("Result of subtract" + a + "+" + b + "is");
        System.out.println(calculator.subtract(a, b));
        System.out.println("Result of multiply" + a + "+" + b + "is");
        System.out.println(calculator.multiply(a, b));
        System.out.println("Result of divide" + a + "+" + b + "is");
        System.out.println(calculator.divide(a, b));
    }
}