package com.github.sejoung.codetest.enumtest.interfacetest;

public class Test {
    public static void main(String[] args) {
        MyInterface mi = EnumImplementingInterface.FIRST;
        System.out.println(mi.getDescription());
    }
}
