package com.github.sejoung.codetest.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

class LazySingleton implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 2648649688472510437L;
    // compile-time constant
    final static String NAME = "LazySingleton";
    // run-time constant
    // final static String NAME = new String("LazySingleton");

    private final static class LazySingletonHolder {
        private final static LazySingleton INSTANCE = new LazySingleton();
    }

    private LazySingleton() {
        System.out.println("hi");
    }

    public static LazySingleton getInstance() {
        return LazySingletonHolder.INSTANCE;
    }


    Object readResolve() throws ObjectStreamException {
        return LazySingletonHolder.INSTANCE;
    }


}
