package com.github.sejoung.codetest.stream;

import java.util.List;

public class HowStreamsWork {
    public static void main(String[] args) {
        List<String> myList = List.of("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }
}
