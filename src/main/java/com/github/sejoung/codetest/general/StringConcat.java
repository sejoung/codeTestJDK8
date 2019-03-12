package com.github.sejoung.codetest.general;

import org.springframework.util.StopWatch;

public class StringConcat {

  private static final int LINE_WIDTH = 80;

  public String statement() {
    String result = "";
    for (int i = 0; i < numItem(); i++) {
      result += lineForItem(i);
    }
    return result;
  }

  public String statement2() {
    StringBuilder sb = new StringBuilder(numItem()*LINE_WIDTH);
    for (int i = 0; i < numItem(); i++) {
      sb.append(lineForItem(i));
    }

    return sb.toString();
  }


  private String lineForItem(int i) {
    return "12345678901234567890123456789012345678901234567890123456789012345678901234567890";
  }

  private int numItem() {
    return 100;
  }


  public static void main(String[] args) {
    StringConcat sc = new StringConcat();

    StopWatch sw = new StopWatch();

    sw.start("statement");

    System.out.println(sc.statement());

    sw.stop();

    sw.start("statement2");

    System.out.println(sc.statement2());

    sw.stop();

    System.out.println(sw.prettyPrint());


  }

}
