package com.github.sejoung.codetest.generics;

public class Stamp {
    private String name;

    public Stamp(String name) {
        this.name = name;
    }

    public void cancel() {
        System.out.println("cancel");
    }
}
