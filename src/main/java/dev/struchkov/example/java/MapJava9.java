package dev.struchkov.example.java;

import java.util.Map;

import static java.util.Map.entry;
import static java.util.Map.ofEntries;

public class MapJava9 {

    public static void main(String[] args) {
        Map<String, Long> map = ofEntries(
                entry("one", 1L),
                entry("two", 2L),
                entry("tree", 3L)
        );
    }

}
