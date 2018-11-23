package com.github.sejoung.codetest.tryfinally;

public class tryTest {
    public static void main(String[] args) {
        MyResource myResource = null;
        try {
            myResource = new MyResource();
            myResource.doSomething();
        } finally {
            if (myResource != null) {
                try {
                    myResource.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
