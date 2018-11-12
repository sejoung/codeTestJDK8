package com.github.sejoung.codetest.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AccessibleObjectTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        OldSingleton a1 = OldSingleton.getInstance();

        Constructor<OldSingleton> c = OldSingleton.class.getDeclaredConstructor();

        c.setAccessible(true);

        OldSingleton a2 = c.newInstance();

        System.out.println(a1 == a2);
    }

}
