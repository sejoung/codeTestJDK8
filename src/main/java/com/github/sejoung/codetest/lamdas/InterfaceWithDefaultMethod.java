package com.github.sejoung.codetest.lamdas;

public interface InterfaceWithDefaultMethod {
    public void someMethod();
    default public void someOtherMethod(){
        System.out.println("Default method implementation in the interface");
    }
}
