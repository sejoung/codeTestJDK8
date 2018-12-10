package com.github.sejoung.codetest.composition;

public class Controller{
    private Model model;

    public void register(Model model){
        this.model = model;
    }

    // Here the wrapper just fails to count changes,
    // because it does not know about the wrapped object
    // references leaked
    public void doChanges(){
        System.out.println("나다 나다");
        model.makeChange();
    }
}

