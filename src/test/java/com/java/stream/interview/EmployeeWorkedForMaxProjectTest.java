package com.java.stream.interview;

import com.java.stream.interview.domain.CorporateEmployee;
import com.java.stream.interview.domain.Project;
import com.java.stream.solutions.InterviewProblemSolutions;

import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * You are given a list of employees. Each employee has an id, name, and a list of projects they
 * have worked on. Each project has a name and duration in months.
 *
 * <p>Write a Java program to find the employee who has worked on the most projects.
 *
 * <p>If there are multiple employees with the same maximum number of projects,
 *
 * <p>return the employee with the longest total duration of projects. If there are still ties,
 * return any one of the tied employees.
 */
public class EmployeeWorkedForMaxProjectTest {
    @Test
    @Disabled()
    public void numberOfOccurencesOfEachCharacter() {
        final var project1 =
                List.of(
                        new Project("E1", 2),
                        new Project("E2", 1),
                        new Project("E3", 2),
                        new Project("E4", 2));

        final var project2 =
                List.of(
                        new Project("E1", 2),
                        new Project("E2", 2),
                        new Project("E3", 2),
                        new Project("E4", 2));

        var corporateEmployees = new ArrayList<CorporateEmployee>();
        corporateEmployees.add(new CorporateEmployee(1, "Priyanka", project1));
        corporateEmployees.add(new CorporateEmployee(2, "Zahid", project2));

        var expected = InterviewProblemSolutions.employeesWorkedForMaxProjects(corporateEmployees);

        int size = corporateEmployees.size();

        CorporateEmployee actual = corporateEmployees.stream()
                .sorted(Comparator.comparing(empl -> empl.projects().size()))
                .sorted(Comparator.comparingInt(empl -> empl.projects()
                        .stream()
                        .mapToInt(value -> value.duration())
                        .sum()))
                .skip(size-1)
                .limit(1)
                .findFirst()
                .orElse(new CorporateEmployee(1, "orElse", new ArrayList<>()));// ;// Assert that the actual output matches the expected output

        Assertions.assertEquals(expected, actual);
    }
}
