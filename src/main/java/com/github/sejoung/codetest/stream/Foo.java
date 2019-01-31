package com.github.sejoung.codetest.stream;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    String name;
    List<Bar> bars = new ArrayList<>();

    Foo(String name) {
        this.name = name;
    }
}
