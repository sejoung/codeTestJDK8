package com.github.sejoung.codetest.lamdas;

public class DefaultMethodSample implements
        InterfaceWithDefaultMethod, InterfaceWithAnotherDefMethod {

    @Override
    public void someMethod() {
        System.out.println("Some method implementation in the class");
    }

    public static void main(String[] args) {
        DefaultMethodSample def1 = new DefaultMethodSample();
        def1.someMethod();
        def1.someOtherMethod();
    }
}
