package com.github.sejoung.codetest.vararg;

public class Demo {
    private void test(int ... vargs) {
        System.out.println("첫번째");
    }

    private void test(int n, int ... vargs) {
        System.out.println("두번째");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();

        demo.test(1,2,3,4);


    }
}
