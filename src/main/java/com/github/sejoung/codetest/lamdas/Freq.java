package com.github.sejoung.codetest.lamdas;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// map.merge를 이용해 구현한 빈도표 - 람다 방식과 메서드 참조 방식을 비교해보자. (259쪽)
public class Freq {
    public static void main(String[] args) {
        Map<String, Integer> frequencyTable = new TreeMap<>();

        List<String> list = List.of("A","B","C","A");

        for (String s : list)
            frequencyTable.merge(s, 1, (count, incr) -> count + incr); // 람다

        System.out.println(frequencyTable);

        frequencyTable.clear();

        for (String s : list)
            frequencyTable.merge(s, 1, Integer::sum); // 메서드 참조
        System.out.println(frequencyTable);


        ExecutorService es = Executors.newFixedThreadPool(10);

        es.execute(() -> System.out.println("lamdas action"));

        es.execute(GoThisClassNameIsHumongous::action);

        es.shutdown();
    }
}
