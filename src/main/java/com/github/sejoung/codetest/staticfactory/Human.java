package com.github.sejoung.codetest.staticfactory;

public class Human {

    private String name;
    
    private Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public static Human createZolla() {
        return new Human("zolla");
    }
    
    public static Human createZola() {
        return new Human("zola");
    }
}
