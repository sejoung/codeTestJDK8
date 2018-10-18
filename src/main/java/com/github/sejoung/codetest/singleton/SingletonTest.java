package com.github.sejoung.codetest.singleton;

public class SingletonTest {
    
    public static void main(String[] args) {
        System.out.println("1======================");
        System.out.println(OldSingleton.NAME);
        System.out.println("2======================");
        OldSingleton oldSingleton1 = OldSingleton.INSTANCE;
        System.out.println("3======================");
        OldSingleton oldSingleton2 = OldSingleton.INSTANCE;
        System.out.println("4======================");
        System.out.println(oldSingleton1 == oldSingleton2);

        System.out.println("1======================");
        System.out.println(LazySingleton.NAME);
        System.out.println("2======================");
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        System.out.println("3======================");
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println("4======================");
        System.out.println(lazySingleton1 == lazySingleton2);
        
    }

}
