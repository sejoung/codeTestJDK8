package com.github.sejoung.codetest.di.test1;

import java.util.List;

public class SpellChecker {
    private static final Lexicon dictionary = new KoreanDicationry();

    private SpellChecker() {
    }

    public static boolean isValid(String word) {
        throw new UnsupportedOperationException();
    }

    public static List<String> suggestions(String typo) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        SpellChecker.isValid("하이");
    }
}

interface Lexicon {
}

class KoreanDicationry implements Lexicon {
}