package com.github.sejoung.codetest.annotation;

import com.github.sejoung.codetest.annotation.markerannotation.Developer;

public class RunTests {
    public static void main(String[] args) {
        Class<?> testClass = Sejoung.class;

        if(testClass.isAnnotationPresent(Developer.class)){
            System.out.println("Developer Annotation");
        }


      //  com.github.sejoung.codetest.annotation.markerinterface.Developer developer = new Sejoung();

    }
}