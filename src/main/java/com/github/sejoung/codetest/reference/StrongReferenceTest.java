package com.github.sejoung.codetest.reference;

public class StrongReferenceTest {

    public static void main(String[] args) {
        A a = new A(); // 강한참조 StrongReferenceTest 에서 A 클래스는 강한 참조이다.

        a.say();
        a = null; // 이제 GC 대상이 된다.
        a.say();

    }
}

class A {
    public void say(){
        System.out.println("하하하");
    }
}
