package com.github.sejoung.codetest.lamdas;

public interface InterfaceWithAnotherDefMethod {
    default public void someOtherMethod(){
        System.out.println("Default method implementation in the interface");
    }
}
