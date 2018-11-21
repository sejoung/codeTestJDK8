package com.github.sejoung.codetest.object;

public class FinalizerTest {
    public static void main(String[] args) {
        FinalizerSample fs = new FinalizerSample();

        fs = null;

        System.gc();

        System.out.println("메롱");

    }
}
