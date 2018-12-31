package com.github.sejoung.codetest.generics.method;

import java.util.*;

// 재귀적 타입 한정을 이용해 상호 비교할 수 있음을 표현 (179쪽)
public class RecursiveTypeBound {
    // 코드 30-7 컬렉션에서 최댓값을 반환한다. - 재귀적 타입 한정 사용 (179쪽)
    public static <E extends Comparable<E>> Optional<E> max(Collection<E> c) {
        if (c.isEmpty())
            return Optional.empty();

        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        }
        return Optional.of(result);
    }

    public static void main(String[] args) {
        List<String> argList = Arrays.asList("a","b","c");
        max(argList).ifPresent((values)->{
            System.out.println(values);
        });
    }
}