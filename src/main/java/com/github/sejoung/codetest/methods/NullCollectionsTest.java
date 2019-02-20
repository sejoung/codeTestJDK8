package com.github.sejoung.codetest.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NullCollectionsTest {

    private final static List<Cheese> cheesesInStock = new ArrayList<>();


/*    public List<Cheese> getCheeses() {
        return cheesesInStock.isEmpty() ? null : new ArrayList<>(cheesesInStock);
    }*/
/*


    public List<Cheese> getCheeses() {
        return new ArrayList<>(cheesesInStock);
    }
*/
    public List<Cheese> getCheeses() {
        return cheesesInStock.isEmpty() ? Collections.emptyList() : new ArrayList<>(cheesesInStock);
    }


    private final static Cheese [] EMPTY_CHEESE_ARRAY = new Cheese[0];
/*
    public Cheese[] getCheeses() {
        return cheesesInStock.toArray(new Cheese[0]);
    }*/

   /* public Cheese[] getCheeses() {
        return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
    }*/

/*
    public Cheese[] getCheeses() {
        return cheesesInStock.toArray(new Cheese[cheesesInStock.size()]);
    }
*/

    public static void main(String[] args) {
        NullCollectionsTest shop = new NullCollectionsTest();
        cheesesInStock.add(Cheese.STILTON);

        List<Cheese> cheeses = shop.getCheeses();

        if (cheeses != null && cheeses.contains(Cheese.STILTON)) {
            System.out.println("좋았어 바로 그거야");
        }
    }
}
