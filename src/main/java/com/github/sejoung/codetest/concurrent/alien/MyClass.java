package com.github.sejoung.codetest.concurrent.alien;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyClass {

  static Object o1 = new Object();

  public static void main(String[] args) throws InterruptedException {
    MyClass mc = new MyClass();
    mc.test3((mc1, sc) -> {

      // 동일한 객체에 대해 동기화하더라도 새 스레드를 생성하지 않으므로 교착 상태가 발생하지 않습니다.
        /*synchronized(sc){
             mc.test1();
          }*/

      //이로 인해 새 스레드가 생성되므로 교착 상태가 발생하므로 스레드간에 잠금 경합이 발생합니다.
      ExecutorService xc = Executors.newFixedThreadPool(1);
      xc.execute(() -> {
        synchronized (sc) {
          System.out.println("Calling test1");
          mc1.test1();
        }
      });
      xc.shutdown();
    });
  }

  public void test1() {
    synchronized (o1) {
      System.out.println("test1");
    }
  }

  public void test3(SetObserver sc) throws InterruptedException {
    synchronized (o1) {
      for (int i = 0; i < 100; i++) {
        System.out.print("test3 >>" + i);
        sc.added(this, sc);
        synchronized (sc) {
          System.out.println("<<");
        }
      }
    }
  }
}
