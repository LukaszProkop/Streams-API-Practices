package com.java.stream.problems.strings;

import com.java.stream.solutions.GeneralProblemsSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class HighestWordTest {
  @Test
  public void findLargestWordInTheString() {
    final String input = "I am interested123455 to grow in my organization";
    final String expected = GeneralProblemsSolution.findLargestWordInTheString(input);

    String actual = Stream.of(input)
            .flatMap(str -> Arrays.stream(str.split(" ")))
            .max(Comparator.comparingInt(String::length))
                    .orElse("");

    Assertions.assertEquals(expected, actual);
  }
}
