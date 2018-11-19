package com.github.sejoung.codetest.objects;

public class AutoBoxingExample {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Long sum = 0l;
        for (long i = 0 ; i <= Integer.MAX_VALUE ; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        long sum2 = 0l;
        for (long i = 0 ; i <= Integer.MAX_VALUE ; i++) {
            sum2 += i;
        }
        System.out.println(sum2);
        System.out.println(System.currentTimeMillis() - start);

    }

}
