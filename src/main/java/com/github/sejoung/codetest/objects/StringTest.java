package com.github.sejoung.codetest.objects;

public class StringTest {
    public static void main(String[] args) {

        String string1 = "1223";
        String string2 = new String("1223");

        Boolean true1 = Boolean.valueOf("true");
        Boolean true2 = Boolean.valueOf("true");
        Boolean true3 = new Boolean("true");

        System.out.println(true1 == true2);
        System.out.println(true1 == true3);
        System.out.println(true1 == Boolean.TRUE);
        System.out.println(true3 == Boolean.TRUE);

    }
}
