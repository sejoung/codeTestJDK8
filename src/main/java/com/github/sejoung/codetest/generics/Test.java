package com.github.sejoung.codetest.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //Object[] objects = new String[2];
       // objects[0] = 12;

       // List<Object> objects = new ArrayList<String>();//호환되지 않는 타입
       // objects.add(12);

        List l = new ArrayList<Number>();
        List<String> ls = l;  // Unchecked warning


    }

@SuppressWarnings("unchecked")
    static void m(List<String>... stringLists) {
        Object[] array = stringLists;
        List<Integer> tmpList = Arrays.asList(42);
        array[0] = tmpList;                // (1)
        String s = stringLists[0].get(0);  // (2)
    }

}
