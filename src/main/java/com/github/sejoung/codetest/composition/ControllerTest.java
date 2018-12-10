package com.github.sejoung.codetest.composition;

public class ControllerTest {
    public static void main(String[] args) {

        Controller c = new Controller();
        ModelChangesCounter m = new ModelChangesCounter(new Model(c));
        c.doChanges();

    }
}
