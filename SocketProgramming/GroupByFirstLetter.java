package com.codegnan.SocketProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByFirstLetter {
    public static Map<Character, List<String>> groupWords(List<String> words) {
        return words.stream()
                    .filter(w -> w != null && !w.isEmpty())
                    .collect(Collectors.groupingBy(w -> w.charAt(0)));
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "ape", "banana", "ball", "cat", "car", "ant");
        Map<Character, List<String>> grouped = groupWords(words);

        
        Map<Character, List<String>> sorted = new TreeMap<>(grouped);
        System.out.println(sorted);
    }
}
