package com.github.sejoung.codetest.general;

import java.util.LinkedHashSet;
import java.util.Set;

public class ReferObject {

  public static void main(String[] args) {

    // 좋은 예. 인터페이스 타입을 사용하였다.
    Set<String> stringSet = new LinkedHashSet<>();


    // 나쁜 예. 클래스 타입을 사용하였다.
    //LinkedHashSet<String> stringSet = new LinkedHashSet<>();



  }

}
