package com.github.sejoung.codetest.synchronizedcollection;

import org.apache.commons.collections4.collection.SynchronizedCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public class SynchronizedCollectionMutiThreadTest {
    private static AtomicInteger counter = new AtomicInteger(0);
    private static final Logger log = LoggerFactory.getLogger(SynchronizedCollectionMutiThreadTest.class);

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("바보");
        list.add("천재");
        list.add("뭐지");
        list.add("진짜?");


        SynchronizedCollection sc = SynchronizedCollection.synchronizedCollection(list);

        String a = "바보";
        Predicate<String> predicate = p->p.equals(a);

        int nThreads = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(nThreads);
        CyclicBarrier barrier = new CyclicBarrier(nThreads);

        for(int i = 0; i < nThreads; i++) {
            executorService.submit(()->{
                int idx = counter.addAndGet(1);
                barrier.await();

                log.debug("idx = {} removeIf={}",idx,sc.removeIf(predicate));

                return null;
            });
        }

        executorService.shutdown();


    }

}
