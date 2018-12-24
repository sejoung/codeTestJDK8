package com.github.sejoung.codetest.generics;

        import java.util.ArrayList;
        import java.util.Collection;
        import java.util.Iterator;

public class OldTest {
    private final static Collection stamps = new ArrayList();

    public static void main(String[] args) {

        stamps.add(new Coin("바보"));


        for (Iterator i = stamps.iterator(); i.hasNext();){
            Stamp stamp = (Stamp) i.next();//ClassCastException
            stamp.cancel();
        }
    }


}
