package com.java.stream.problems.numbers;

import com.java.stream.solutions.GeneralProblemsNumbersSolution;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given a numeric array , re arrange the elements to form a highest possible value.
 * Input:  {1, 34, 3, 98, 9, 76, 45, 4};
 * Output: 998764543431
 * Explanation: 9,98,76,45,4,34,3,1
 * */
public class ReArrangeElementInDecendingOrderTest {

  @Test
  public void test() {
    var input = List.of(1, 34, 3, 98, 9, 76, 45, 4);
    var expected = GeneralProblemsNumbersSolution.getHighestPossibleValue(input);
    var actual = input.stream()
            .map(String::valueOf)
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.joining());

    Assertions.assertEquals(expected, actual);
  }
}
