package com.github.sejoung.codetest.enumtest.interfacetest;

public enum EnumImplementingInterface implements MyInterface {
    FIRST("First Value"), SECOND("Second Value");

    private String description = null;

    private EnumImplementingInterface(String desc){
        this.description = desc;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}