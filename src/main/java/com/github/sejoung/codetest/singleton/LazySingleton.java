package com.github.sejoung.codetest.singleton;

class LazySingleton {
    // compile-time constant
    final static String NAME = "LazySingleton";
    // run-time constant
    // final static String NAME = new String("OldSingleton");

    private final static class LazySingletonHolder {
        private final static LazySingleton INSTANCE = new LazySingleton();
    }
    
    private LazySingleton() {
        System.out.println("hi");
    }

    public static LazySingleton getInstance() {
        return LazySingletonHolder.INSTANCE;
    }



}
