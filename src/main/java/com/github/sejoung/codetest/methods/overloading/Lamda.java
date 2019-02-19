package com.github.sejoung.codetest.methods.overloading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lamda {
    public static void main(String[] args) {

        new Thread(System.out::println).start();

        ExecutorService es = Executors.newCachedThreadPool();

       // es.submit(System.out::println);

    }
}
