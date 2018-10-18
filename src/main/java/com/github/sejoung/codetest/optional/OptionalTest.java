package com.github.sejoung.codetest.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OptionalTest {

    public static Optional<Fruit> find(String name, List<Fruit> fruits) {
        for (Fruit fruit : fruits) {
            if (fruit.getName().equals(name)) {
                return Optional.of(fruit);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {

        List<Fruit> fruits = Arrays.asList(new Fruit("apple"), new Fruit("grape"), new Fruit("orange"));

        Optional<Fruit> found = find("lemon", fruits);

        if (found.isPresent()) {
            Fruit fruit = found.get();
            log.info(fruit.getName());
        }

        log.info(found.orElse(new Fruit("Kiwi")).getName());
        found.ifPresent(f -> { log.info(f.getName()); });

        log.info(found.orElseGet(() -> new Fruit("Lemon")).getName());
        
        
    }
}
