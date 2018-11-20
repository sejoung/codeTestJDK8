package com.github.sejoung.codetest.reference;

import java.lang.ref.SoftReference;

public class SoftReferencesTest {
    public static void main(String[] args) {
        B b = new B(); //Strong Reference
        b.say();
        SoftReference<B> softB = new SoftReference<B>(b);
        b = null;//GC 대상
        b = softB.get();
        b.say();

    }
}

class B {
    public void say(){
        System.out.println("하하하");
    }
}
