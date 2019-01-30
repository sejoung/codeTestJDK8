package com.github.sejoung.codetest.lamdas;

public interface SimpleInterface {
    public void doSomeWork();
    default public void doSomeOtherWork(){
        System.out.println("DoSomeOtherWork implementation in the interface");
    }
}
