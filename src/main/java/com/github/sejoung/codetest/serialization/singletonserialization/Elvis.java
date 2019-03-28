package com.github.sejoung.codetest.serialization.singletonserialization;

import java.io.Serializable;
import java.util.Arrays;

public class Elvis implements Serializable {

  public static final Elvis INSTANCE = new Elvis();

  private static final long serialVersionUID = 0;

  private String[] favoriteSongs = {"자니", "연결고리"};

  private Elvis() {

  }

  public void printFavorites() {
    System.out.println(Arrays.toString(favoriteSongs));
  }

  private Object readResolve() {
    return INSTANCE;
  }

}
