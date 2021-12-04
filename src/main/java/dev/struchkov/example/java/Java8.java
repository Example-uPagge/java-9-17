package dev.struchkov.example.java;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {

    public static void main(String[] args) {
        Set<Integer> simpleNumbers = Stream.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
                .collect(Collectors.toUnmodifiableSet());
    }

}
