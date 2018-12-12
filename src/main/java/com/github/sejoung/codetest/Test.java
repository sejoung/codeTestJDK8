package com.github.sejoung.codetest;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal advrtesAmt = new BigDecimal(0);
        BigDecimal tobe = new BigDecimal(200);
        advrtesAmt.add(tobe);


        advrtesAmt=    advrtesAmt.add(tobe);



        System.out.println(advrtesAmt);


    }
}
