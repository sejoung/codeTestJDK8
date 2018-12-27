package com.github.sejoung.codetest.generics;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

// 코드 28-6 리스트 기반 Chooser - 타입 안전성 확보! (168쪽)
public class Chooser<T> {
    private final List<T> choiceList;

    public Chooser(Collection<T> choices) {
        choiceList = new ArrayList<>(choices);
    }

    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> stringList = Arrays.asList("1","A");

       // Chooser<Integer> chooser = new Chooser<>(intList);
        Chooser<String> chooser = new Chooser<>(stringList);


        for (int i = 0; i < 10; i++) {
            String choice = chooser.choose();
            System.out.println(choice);
        }
    }
}
