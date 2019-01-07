package com.github.sejoung.codetest.generics.nealgafter;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<Class<?>, Object>();

    public <T> void setFavorite(Class<T> klass, T thing) {
        favorites.put(klass, thing);
    }

    public <T> T getFavorite(Class<T> klass) {
        return klass.cast(favorites.get(klass));
    }

    public static void main(String[] args) {
        Favorites f = new Favorites();
        f.setFavorite(String.class, "Java");
        f.setFavorite(Integer.class, 0xcafebabe);
       // f.setFavorite (List<String>.class, Collections.emptyList ());

        String s = f.getFavorite(String.class);
        int i = f.getFavorite(Integer.class);

        System.out.println(s);
        System.out.println(i);
    }
}
