package com.github.sejoung.codetest.memory;

import java.util.Arrays;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() throws Exception {
        if (size == 0)
            throw new Exception();
        return elements[--size];
    }

    /**
     * 원소를 위한 공간을 적어도 하나 이상 확보한다.
     * 배열 크기를 늘려야 할 때마다 대략 두 배씩 늘린다.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
/*

    // 코드 7-2 제대로 구현한 pop 메서드 (37쪽)
    public Object pop() throws Exception{
        if (size == 0)
            throw new Exception();
        Object result = elements[--size];
        elements[size] = null; // 다 쓴 참조 해제
        return result;
   }

*/
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        Thread.sleep(200000);

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            stack.push(i);
            System.out.println(i);
        }

        try {
            while (true)
                System.err.println(stack.pop());
        } catch (Exception e) {
            System.out.println("끝");
        }


        Thread.sleep(20000);

    }
}
