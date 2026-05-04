package com.github.sava8n.leetcode.arays_and_strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxConsecutiveOnesIIITest {

    @ParameterizedTest
    @MethodSource("cases")
    void check_case(int[] nums, int k, int expected) {
        var result = new MaxConsecutiveOnesIII().solve(nums, k);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[] {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2, 6),
                Arguments.of(new int[] {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3, 10)
        );
    }
}
