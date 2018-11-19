package com.github.sejoung.codetest.objects;

import java.util.regex.Pattern;

public class RomanNumber {
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeralCompile(String s) {
        return ROMAN.matcher(s).matches();
    }


    static boolean isRomanNumeral(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int max = 100000;

        for (int i = 0 ; i <= max ; i++) {
            RomanNumber.isRomanNumeral("123123");
        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (int i = 0 ; i <= max ; i++) {
            RomanNumber.isRomanNumeralCompile("123123");
        }
        System.out.println(System.currentTimeMillis() - start);




    }
}
