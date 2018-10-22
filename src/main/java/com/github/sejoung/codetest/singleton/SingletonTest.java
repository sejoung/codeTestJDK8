package com.github.sejoung.codetest.singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonTest {

    public static void main(String[] args) throws Exception {
        System.out.println("1======================");
        System.out.println(OldSingleton.NAME);
        System.out.println("2======================");
        OldSingleton oldSingleton1 = OldSingleton.INSTANCE;
        System.out.println("3======================");
        OldSingleton oldSingleton2 = OldSingleton.INSTANCE;
        System.out.println("4======================");
        System.out.println(serialize(oldSingleton1) == serialize(oldSingleton2));

        System.out.println("1======================");
        System.out.println(LazySingleton.NAME);
        System.out.println("2======================");
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        System.out.println("3======================");
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println("4======================");
        System.out.println(serialize2(lazySingleton1) == serialize2(lazySingleton2));

    }

    public static OldSingleton serialize(OldSingleton o) throws Exception {
        byte[] serialized;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                oos.writeObject(o);
                // serializedMember -> 직렬화된 member 객체
                serialized = baos.toByteArray();
            }
        }
        OldSingleton member = null;
        try (ByteArrayInputStream bais = new ByteArrayInputStream(serialized)) {
            try (ObjectInputStream ois = new ObjectInputStream(bais)) {
                // 역직렬화된 Member 객체를 읽어온다.
                Object objectMember = ois.readObject();
                member = (OldSingleton) objectMember;
            }
        }
        return member;
    }
    
    
    public static LazySingleton serialize2(LazySingleton o) throws Exception {
        byte[] serialized;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                oos.writeObject(o);
                // serializedMember -> 직렬화된 member 객체
                serialized = baos.toByteArray();
            }
        }
        LazySingleton member = null;
        try (ByteArrayInputStream bais = new ByteArrayInputStream(serialized)) {
            try (ObjectInputStream ois = new ObjectInputStream(bais)) {
                // 역직렬화된 Member 객체를 읽어온다.
                Object objectMember = ois.readObject();
                member = (LazySingleton) objectMember;
            }
        }
        return member;
    }

}
