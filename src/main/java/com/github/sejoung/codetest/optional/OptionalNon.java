package com.github.sejoung.codetest.optional;

import java.util.Arrays;
import java.util.List;

public class OptionalNon {

    public static Fruit find(String name, List<Fruit> fruits) {
        for (Fruit fruit : fruits) {
            if (fruit.getName().equals(name)) {
                return fruit;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        List<Fruit> fruits = Arrays.asList(new Fruit("apple"), new Fruit("grape"), new Fruit("orange"));

        Fruit found = find("lemon", fruits);

        // String name = found.getName(); // NPE 발생

        if (found != null) {
            String name = found.getName();
        }
    }

}
