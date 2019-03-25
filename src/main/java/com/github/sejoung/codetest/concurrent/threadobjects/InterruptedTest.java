package com.github.sejoung.codetest.concurrent.threadobjects;

import java.time.LocalDateTime;

public class InterruptedTest implements Runnable {

  private String input;

  InterruptedTest(String input) {
    this.input = input;
  }


  public static void main(String[] args) {

    String[] inputs = {"test", "a", "b"};

    for (int i = 0; i < inputs.length; i++) {
      heavyCrunch(inputs[i]);
      if (Thread.interrupted()) {
        // We've been interrupted: no more crunching.
        System.out.println("끝끝");
        return;
      }
    }
    System.out.println("안녕");


  }

  public static void heavyCrunch(String input) {
    new Thread(new InterruptedTest(input)).start();
  }

  @Override
  public void run() {
    LocalDateTime now = LocalDateTime.now();

    LocalDateTime plusOneMinutes = now.plusMinutes(1);
    do {
     // System.out.println(this.input+"now is: " + now + " plusOneMinutes is: " + plusOneMinutes);
    } while (plusOneMinutes.isAfter(LocalDateTime.now()));
  }
}
