package com.github.sejoung.codetest.singleton;

import java.io.Serializable;

class OldSingleton implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -4253142440722917903L;
    // compile-time constant
    final static String NAME = "OldSingleton";
    // run-time constant
    // final static String NAME = new String("OldSingleton");
    final static OldSingleton INSTANCE = new OldSingleton();

    private OldSingleton() {
        System.out.println("hi");
    }

}
