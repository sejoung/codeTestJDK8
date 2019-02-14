package com.github.sejoung.codetest.methods;

        import java.util.Objects;

public class ParametersValidity {
    public static void main(String[] args) {

        String nullTest = null;

        assert false;
        Objects.requireNonNull(nullTest,"널이다.");

    }


}
