package com.github.sejoung.codetest.enumtest;

public class EnumTest {
    public static void main(String[] args) {
        EnumTest et = new EnumTest();

        et.orangeShow(Orange.BLOOD,Orange.TEMPLE);

    }

    public void orangeShow(Orange... orangeType) {
        for (Orange orange : orangeType){
            System.out.println(orange);
        }
    }
}
