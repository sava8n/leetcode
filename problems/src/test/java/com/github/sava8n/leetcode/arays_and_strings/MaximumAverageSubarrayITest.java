package com.github.sava8n.leetcode.arays_and_strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumAverageSubarrayITest {

    @ParameterizedTest
    @MethodSource("cases")
    void check_case(int[] nums, int k, double expected) {
        var result = new MaximumAverageSubarrayI().solve(nums, k);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[] {1, 12, -5, -6, 50, 3}, 4, 12.75),
                Arguments.of(new int[] {5}, 1, 5.0)
        );
    }
}
