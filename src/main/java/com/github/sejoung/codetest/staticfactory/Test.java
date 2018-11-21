package com.github.sejoung.codetest.staticfactory;

public class Test {
    
    public static void main(String[] args) {
        
        Human zolla = Human.createZolla(); 
        System.out.println(zolla.getName());
        
        Human zola = Human.createZola(); 
        System.out.println(zola.getName());
        

    }

}
