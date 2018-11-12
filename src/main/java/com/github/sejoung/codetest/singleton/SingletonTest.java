package com.github.sejoung.codetest.singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.AccessibleObject;

public class SingletonTest {

    public static void main(String[] args) {
        
        try {
            System.out.println("1======================");
            System.out.println(OldSingleton.NAME);
            System.out.println("2======================");
            OldSingleton oldSingleton1 = OldSingleton.getInstance();
            System.out.println("3======================");
            OldSingleton oldSingleton2 = OldSingleton.getInstance();
            System.out.println("4======================");
            System.out.println(serializeAndUnSerialize(oldSingleton1) == serializeAndUnSerialize(oldSingleton2));

            System.out.println("1======================");
            System.out.println(LazySingleton.NAME);
            System.out.println("2======================");
            LazySingleton lazySingleton1 = LazySingleton.getInstance();
            System.out.println("3======================");
            LazySingleton lazySingleton2 = LazySingleton.getInstance();
            System.out.println("4======================");
            System.out.println(serializeAndUnSerialize(lazySingleton1) == serializeAndUnSerialize(lazySingleton2));


            EnumSingleton.INSTANCE.test();

        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }

    public static <T> T serializeAndUnSerialize(T o) throws Exception {
        
        byte[] serialized;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                oos.writeObject(o);
                serialized = baos.toByteArray();
            }
        }
        
        T unSerialized = null;
        try (ByteArrayInputStream bais = new ByteArrayInputStream(serialized)) {
            try (ObjectInputStream ois = new ObjectInputStream(bais)) {
                Object object = ois.readObject();
                unSerialized = (T) object;
            }
        }
        return unSerialized;
    }

}
