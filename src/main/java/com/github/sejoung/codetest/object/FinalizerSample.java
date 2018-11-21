package com.github.sejoung.codetest.object;

public class FinalizerSample {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize 종료");
    }
}
