package com.github.sejoung.codetest.composition;

// wrapper class
public class ModelChangesCounter{
    private final Model model;
    private int changesMade;

    ModelChangesCounter(Model model){
        this.model = model;
    }

    // The wrapper is intended to count changes,
    // but those changes which are invoked from
    // Controller are just skipped
    public void makeChange(){
        model.makeChange();
        changesMade++;
        System.out.println(changesMade);
    }
}