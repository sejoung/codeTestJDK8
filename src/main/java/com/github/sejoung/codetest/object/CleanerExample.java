package com.github.sejoung.codetest.object;


// import sun.misc.Cleaner;

public class CleanerExample {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            String id = Integer.toString(i);
            MyObject myObject = new MyObject(id);
    /*
            Cleaner.create(myObject, ()->{
                //System.out.println("gc "+myObject.getId());
                System.out.printf("MyObject with id %s, is gc'ed%n", id);

            });
    */        myObject = null;
        }

        System.gc();

        Thread.sleep(10000);

    }

}