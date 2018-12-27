package com.github.sejoung.codetest.generics;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ChooserOld {
    private final Object[] choiceArray;

    public ChooserOld(Collection choices) {
        choiceArray = choices.toArray();
    }

    public Object choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceArray[rnd.nextInt(choiceArray.length)];
    }

    public static void main(String[] args) {
        //List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> stringList = Arrays.asList("1","A");

        ChooserOld chooser = new ChooserOld(stringList);

        for (int i = 0; i < 10; i++) {
            Integer choice = (Integer) chooser.choose();
            System.out.println(choice);
        }
    }
}
