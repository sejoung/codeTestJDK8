package com.github.sejoung.codetest.vararg;

public class Company {
    public static void main(String[] args) {
        String siteName = "programiz.com";
        int empCount = 6;
        String type = "tutorial website";
        System.out.println(
                String.format(
                        "Site Name : %s, Emp Count: %d Type: %s",
                        siteName, empCount, type
                )
        );
    }
}
