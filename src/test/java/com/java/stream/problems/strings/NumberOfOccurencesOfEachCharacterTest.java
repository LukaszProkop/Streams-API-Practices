package com.java.stream.problems.strings;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfOccurencesOfEachCharacterTest {
  @Test
  public void numberOfOccurencesOfEachCharacter() {
    String input = "the quick brown fox jumps right over the little lazy dog little";
    final var expectedOutput =
        "{t=7, h=3, e=5,  =11, q=1, u=2, i=4, c=1, k=1, b=1, r=3, o=4, w=1, n=1, f=1, x=1, j=1, m=1, p=1, s=1, g=2, v=1, l=5, a=1, z=1, y=1, d=1}";

    var actualOutput = Stream.of(input)
            .flatMap(v -> Arrays.stream(v.split("")))
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())); // Assert that the actual output matches the expected output
    assertEquals(expectedOutput, actualOutput.toString());
  }

  private Map<Character, Long> solution1() {
    String input = "the quick brown fox jumps right over the little lazy dog little";
    return input
        .chars()
        .mapToObj(x -> (char) x)
        .collect(
            Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
  }
}
