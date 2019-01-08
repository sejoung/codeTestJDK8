package com.github.sejoung.codetest.enumtest;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Level level = Level.HIGH;
        System.out.println(level.getLevelCode());

        if (level == Level.HIGH) {
            System.out.println("높다");
        } else if (level == Level.MEDIUM) {
            System.out.println("중간");
        } else if (level == Level.LOW) {
            System.out.println("낮다");
        }

        switch (level) {
            case HIGH   : System.out.println("switch 높다"); break;
            case MEDIUM : System.out.println("switch 중간"); break;
            case LOW    : System.out.println("switch 낮다"); break;
        }

        for (Level forlevel : Level.values()) {
            System.out.println(forlevel);
        }

        String levelText = Level.HIGH.toString();
        System.out.println(levelText);

        System.out.println(Level.HIGH);

        Level levelValueOf = Level.valueOf("HIGH");

        System.out.println(levelValueOf);

        EnumSet<Level> enumSet = EnumSet.of(Level.HIGH, Level.MEDIUM);

        for(Level enumLevael : enumSet){
            System.out.println(enumLevael);
        }

        Map<Level, String> enumMap = new EnumMap<>(Level.class);
        enumMap.put(Level.HIGH  , "High level");
        enumMap.put(Level.MEDIUM, "Medium level");
        enumMap.put(Level.LOW   , "Low level");

        String levelValue = enumMap.get(Level.HIGH);

        System.out.println(levelValue);


    }
}
