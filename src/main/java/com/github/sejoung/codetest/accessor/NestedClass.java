package com.github.sejoung.codetest.accessor;

public class NestedClass {



    public void Test(){
        A a = new A();
        a.a = "1";
    }

    private class A{
        public String a;

    }
}
