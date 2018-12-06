package com.github.sejoung.codetest.accessiblility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToClone {
    private static final String[] VALUES = {"A", "B", "C"};
    public static final String[] values(){
      return VALUES.clone();
    }
}
