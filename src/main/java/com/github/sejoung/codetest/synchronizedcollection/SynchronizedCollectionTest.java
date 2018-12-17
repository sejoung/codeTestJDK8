package com.github.sejoung.codetest.synchronizedcollection;

import org.apache.commons.collections4.collection.SynchronizedCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SynchronizedCollectionTest {
    private static final Logger log = LoggerFactory.getLogger(SynchronizedCollectionTest.class);

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("바보");
        list.add("천재");
        list.add("뭐지");
        list.add("진짜?");


        SynchronizedCollection sc = SynchronizedCollection.synchronizedCollection(list);

        String a = "바보";
        Predicate<String> predicate = p->p.equals(a);

        sc.forEach((s)->{
            log.debug("before ={}",s);
        });

        sc.removeIf(predicate);

        sc.forEach((s)->{
            log.debug("after ={}",s);
        });


    }

}
