package com.github.sejoung.codetest.general;

public class ThreadLocal {

    //객체 생성 불가
    private ThreadLocal() {
    }

    // 현 스레드의 값을 키로 구분해 저장
    public static void set(String key, Object value) {
    }

    //키가 가르키는 현 스레드의 값을 반환한다.
    public static Object get(String key) {
        return null;
    }
}
