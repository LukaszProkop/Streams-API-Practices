package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class NumberOfOccurencesOfEachWordTest {
    @Test
    public void numberOfOccurencesOfEachWord() {
        String input = "the quick brown fox jumps right over the little lazy dog little";
        final Map<String, Long> expectedOutput = Map.ofEntries(Map.entry("the", 2L),
                Map.entry("quick", 1L),
                Map.entry("lazy", 1L),
                Map.entry("jumps", 1L),
                Map.entry("right", 1L),
                Map.entry("over", 1L),
                Map.entry("brown", 1L),
                Map.entry("dog", 1L),
                Map.entry("fox", 1L),
                Map.entry("little", 2L));

        String actualOutput = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).toString();
        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, actualOutput);
    }

    private void solution1() {
        String input = "the quick brown fox jumps right over the little lazy dog little";
        Map<String, Long> collect = Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
