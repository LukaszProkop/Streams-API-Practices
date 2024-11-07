package com.java.stream.problems.numbers;

import com.java.stream.solutions.GeneralProblemsNumbersSolution;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given a list of Strings : ["as", "123", "32", "2as"],
 * Create another list that contains only integers.
 * The output should be: [123,32]
 */
public class IntegersOnlyTest {
    @Test
    void testCheckAllIntegersWithoutAlphabets(){
        var input = List.of("1","12","12a","a12");
        var actual = input.stream()
                .filter(v -> v.matches("\\d+"))
                .toList();
        var expected = GeneralProblemsNumbersSolution.getNumberOnly(input);

        Assertions.assertEquals(expected, actual);

    }
}
