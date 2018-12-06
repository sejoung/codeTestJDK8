package com.github.sejoung.codetest.accessiblility;

public class ArrayToCloneTest {
    public static void main(String[] args) {

        String[] test = ArrayToClone.values();
        for (String v : test) {
            System.out.println(v);
        }

        test[1] = "T";

        for (String v : test) {
            System.out.println(v);
        }


        for (String v : ArrayToClone.values()) {
            System.out.println(v);
        }


    }
}
