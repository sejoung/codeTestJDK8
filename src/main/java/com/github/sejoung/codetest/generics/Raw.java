package com.github.sejoung.codetest.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// 코드 26-4 런타임에 실패한다. - unsafeAdd 메서드가 로 타입(List)을 사용 (156-157쪽)
public class Raw {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(42));
        String s = strings.get(0); // 컴파일러가 자동으로 형변환 코드를 넣어준다.

    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    static int numElementsInCommon(Set s1, Set s2) {
//        static int numElementsInCommon(Set<?> s1, Set<?> s2){
        int result = 0;


        for (Object o1 : s1) {

            if (o1 instanceof Set) { //raw 타입
                Set<?> s = (Set<?>) o1; // 비한정 와일드카드 타입
            }

            if (s2.contains(01)) {
                result++;
            }
        }
        return result;
    }


}
