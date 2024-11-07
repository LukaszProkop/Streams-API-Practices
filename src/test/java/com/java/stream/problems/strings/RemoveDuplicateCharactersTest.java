package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.java.stream.solutions.GeneralProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateCharactersTest {
  @Test
  public void testRemoveDuplicates() {
    final String input = "dabfcadef";
    final String actual = Arrays.stream(input.split(""))
            .distinct()
            .collect(Collectors.joining());
    final String expected = GeneralProblemsSolution.getUniqueCharacters(input);

    assertEquals(expected, actual);
  }
}
