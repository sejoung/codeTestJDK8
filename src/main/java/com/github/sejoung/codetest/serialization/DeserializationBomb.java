package com.github.sejoung.codetest.serialization;

import static com.github.sejoung.codetest.serialization.Util.deserialize;
import static com.github.sejoung.codetest.serialization.Util.serialize;

import java.util.HashSet;
import java.util.Set;

// 코드 85-1 역직렬화 폭탄 - 이 스트림의 역직렬화는 영원히 계속된다. (451-452쪽)
public class DeserializationBomb {

  public static void main(String[] args) throws Exception {
    System.out.println(bomb().length);
    deserialize(bomb());
  }

  static byte[] bomb() {
    Set<Object> root = new HashSet<>();
    Set<Object> s1 = root;
    Set<Object> s2 = new HashSet<>();
    for (int i = 0; i < 100; i++) {
      Set<Object> t1 = new HashSet<>();
      Set<Object> t2 = new HashSet<>();
      t1.add("foo"); // t1을 t2와 다르게 만든다.
      s1.add(t1);
      s1.add(t2);
      s2.add(t1);
      s2.add(t2);
      s1 = t1;
      s2 = t2;
    }
    return serialize(root);
  }
}
