package com.github.sejoung.codetest.singleton;

class OldSingleton {
    //compile-time constant
    final static String NAME = "OldSingleton";
    //run-time constant
   // final static String NAME = new String("OldSingleton");
    final static OldSingleton INSTANCE = new OldSingleton();

    private OldSingleton() {
        System.out.println("hi");
    }

}
