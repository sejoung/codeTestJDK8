package com.github.sejoung.codetest.constantutilityclass;

import static com.github.sejoung.codetest.constantutilityclass.PhysicalConstants.AVOGADROS_NUMBER;

public class Test {
    double atoms(double mols){
        return AVOGADROS_NUMBER * mols;
    }
    // PhysicalConstants 를 자주사용하면 정적임포트가 좋다.

}
