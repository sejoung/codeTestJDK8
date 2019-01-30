package com.github.sejoung.codetest.lamdas;

public class SimpleInterfaceImpl implements SimpleInterface{
    @Override
    public void doSomeWork() {
        System.out.println("Do Some Work implementation in the class");
    }

    public static void main(String[] args) {
        SimpleInterfaceImpl simpObj = new SimpleInterfaceImpl();
        simpObj.doSomeWork();
        simpObj.doSomeOtherWork();

    }
}