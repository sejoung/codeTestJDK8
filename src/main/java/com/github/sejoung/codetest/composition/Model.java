package com.github.sejoung.codetest.composition;

// basic class which we will wrap
public class Model{
    private final Controller controller;

    Model(Controller controller){
        this.controller = controller;
        controller.register(this); //Pass SELF reference
    }

    public void makeChange(){
        System.out.println("기본 Model");
    }
}