package com.github.sejoung.codetest.accessiblility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
    private static final String[] VALUES = {"A", "B", "C"};
    public static final List<String> LISTVALUES = Collections.unmodifiableList(Arrays.asList(VALUES));

}
