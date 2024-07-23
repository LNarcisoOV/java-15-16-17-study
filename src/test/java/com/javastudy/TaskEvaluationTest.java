package com.javastudy;

import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;

public class TaskEvaluationTest {

    @Test
    void countOccurrences() throws FileNotFoundException {
        assertEquals(TaskEvaluation.countOcurrences("must"), eq(6));
        assertEquals(TaskEvaluation.countOcurrences("anyNonExistedValue"), eq(0));
    }
}
