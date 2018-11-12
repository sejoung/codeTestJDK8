package com.github.sejoung.codetest.singleton;

import java.io.Serializable;

class OldSingleton implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -4253142440722917903L;

    private static int CNT = 0;


    // compile-time constant
    final static String NAME = new String("OldSingleton");
    // run-time constant
    // final static String NAME = new String("OldSingleton");
    private static OldSingleton INSTANCE = null;

    static {
        try {
            INSTANCE = new OldSingleton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private OldSingleton() throws Exception {
        if(CNT>0){
            throw new AssertionError();
        }
        System.out.println("hi");

        CNT++;
    }
    public static OldSingleton getInstance() {
        return INSTANCE;
    }


}
