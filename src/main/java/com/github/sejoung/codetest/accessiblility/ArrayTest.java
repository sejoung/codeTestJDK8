package com.github.sejoung.codetest.accessiblility;

public class ArrayTest {

    public static final String[] VALUES = {"A", "B", "C"};

    public static void main(String[] args) {

        for (String v : VALUES) {
            System.out.println(v);
        }

        ArrayTest.VALUES[1] = "T";


        for (String v : VALUES) {
            System.out.println(v);
        }

    }
}
