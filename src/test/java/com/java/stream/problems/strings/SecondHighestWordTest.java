package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.java.stream.solutions.GeneralProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SecondHighestWordTest {
    @Test
    public void find2ndHighestWord() {
        final String input = "I am interested123455 to grow in my organization";
        String expected = GeneralProblemsSolution.find2ndLargestWordInTheString(input);

        final String actual = Arrays.stream(input.split(" "))
                .sorted(Comparator.comparingInt(String::length))
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .collect(Collectors.joining());

        assertEquals(expected, actual);
    }

}
