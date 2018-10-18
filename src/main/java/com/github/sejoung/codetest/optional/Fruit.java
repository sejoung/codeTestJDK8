package com.github.sejoung.codetest.optional;

import lombok.Getter;

public class Fruit {

    @Getter
    private String name;

    public Fruit(String name) {
        this.name = name;
    }
}
