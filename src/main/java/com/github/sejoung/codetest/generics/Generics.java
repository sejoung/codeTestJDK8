package com.github.sejoung.codetest.generics;

import java.util.Arrays;
import java.util.List;

public class Generics {
    static class Hello<T> {// T -> type parameter

    }
/*

    static void print(String value){
        System.out.println(value);
    }
*/
/*

    <T> void print(T t){
        System.out.println(t);
    }
*/

/*
   static <S> void print(S s){
        System.out.println(s);
    }
*/

    static void printList(List<Object> list){
        list.forEach(s-> System.out.println(s));
    }

    static void printList2(List<?> list){
        list.forEach(s-> System.out.println(s));
    }

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3,4,5);
        printList(list);
        printList2(list);

     //   new Hello<String>();// type argument

        //컴파일시에 타입을 체크 해줌
//        List<String> list = new ArrayList<>();


        //raw type
/*
        List<Integer> ints = Arrays.asList(1,2,3);
        List rawInts = ints;
        List<Integer> ints2 = rawInts;
        List<String> strs = rawInts;
        String str = strs.get(0);
*/
/*


        new Generics().print(1);

        new Generics().print("2");

*/
/*

        Generics.print("123");
        Generics.print(1);

*/


    }
}
