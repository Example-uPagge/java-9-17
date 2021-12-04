package dev.struchkov.example.java;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.entry;
import static java.util.Map.ofEntries;

public class Main {

    public static void main(String[] args) {
        java8();
        java9();
    }

    public static void java8() {
        Set<Integer> simpleNumbers = Stream.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
                .collect(Collectors.toUnmodifiableSet());
    }

    public static void java9() {
        Set<Integer> simpleNumbers = Set.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        Map<String, Long> map = ofEntries(
                entry("one", 1L),
                entry("two", 2L),
                entry("tree", 3L)
        );
    }

}
