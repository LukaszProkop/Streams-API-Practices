package com.java.stream.general_problems.numbers;

import org.junit.jupiter.api.Test;

/*
* Q15 ) Given a numeric array , re arrange the elements to form a smallest possible value.

input is: int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};

output is: 133444576998

Solution is: Arrays.stream(arr).mapToObj(i-> i+"").sorted().forEach(System.out::print);*/
public class ReArrangeElementInAscendingOrderTest {

  @Test
  public void test() {}
}