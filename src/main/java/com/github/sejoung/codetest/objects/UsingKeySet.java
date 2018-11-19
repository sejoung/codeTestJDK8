package com.github.sejoung.codetest.objects;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UsingKeySet {

    public static void main(String[] args) {
        Map<String, Integer> menu = new HashMap<>();
        menu.put("Burger", 8);
        menu.put("Pizza", 9);

        Set<String> names1 = menu.keySet();
        Set<String> names2 = menu.keySet();
        System.out.println(names2.size());
        System.out.println(names1.size());
        System.out.println(menu.size());
        names1.remove("Burger");
        System.out.println(names2.size());
        System.out.println(names1.size());
        System.out.println(menu.size());
    }
}
