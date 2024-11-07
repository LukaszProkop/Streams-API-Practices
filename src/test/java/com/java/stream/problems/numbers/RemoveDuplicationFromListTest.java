package com.java.stream.problems.numbers;

import com.github.javafaker.Faker;
import com.java.stream.solutions.GeneralProblemsNumbersSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Remove duplicates from an arrayList.
 * */
public class RemoveDuplicationFromListTest {
  @Test
  void testRemoveDuplicationFromListTest() {
    final var instance = Faker.instance();

    final var someValue = instance.number().randomNumber();
    final var input =
        List.of(
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            someValue,
            someValue,
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber());
    var actual = input.stream()
            .distinct()
            .toList();
    var expected = GeneralProblemsNumbersSolution.getUniqueNumberFromList(input);

    Assertions.assertEquals(expected, actual);
  }
}
