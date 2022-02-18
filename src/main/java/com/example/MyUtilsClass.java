package com.example;

public class MyUtilsClass {

    public static void main(String[] args) {
        printHello("<userName>");
    }

    public static void printHello(final String name) {
        System.out.printf("Hello, %s!", name);
    }

}
