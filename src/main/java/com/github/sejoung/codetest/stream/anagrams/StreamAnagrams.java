package com.github.sejoung.codetest.stream.anagrams;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

// 코드 45-2 스트림을 과하게 사용했다. - 따라 하지 말 것! (270-271쪽)
public class StreamAnagrams {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Path dictionary = Paths.get("src","main","resources","anagrams.txt");
        int minGroupSize = 4;

        try (Stream<String> words = Files.lines(dictionary)) {
            words.collect(
                    groupingBy(word -> word.chars().sorted()
                            .collect(StringBuilder::new,
                                    (sb, c) -> sb.append((char) c),
                                    StringBuilder::append).toString()))
                    .values().stream()
                    .filter(group -> group.size() >= minGroupSize)
                    .map(group -> group.size() + ": " + group)
                    .forEach(System.out::println);
        }
    }
}