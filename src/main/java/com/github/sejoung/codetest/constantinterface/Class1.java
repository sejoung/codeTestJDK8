package com.github.sejoung.codetest.constantinterface;

public class Class1 implements Constants {

    public static final int CONSTANT = 2;    // *

    public static void main(String args[]) throws Exception {
        System.out.println(CONSTANT);
    }
}