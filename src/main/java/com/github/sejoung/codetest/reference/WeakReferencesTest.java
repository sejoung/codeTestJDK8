package com.github.sejoung.codetest.reference;

import java.lang.ref.WeakReference;

public class WeakReferencesTest {
    public static void main(String[] args) {

        C c = new C(); //Strong Reference
        c.say();
        WeakReference<C> weakC = new WeakReference<C>(c);

        c = null; // GC 대상
        c = weakC.get();
        c.say();
    }
}
class C {

    public void say(){
        System.out.println("하하하");
    }
}
