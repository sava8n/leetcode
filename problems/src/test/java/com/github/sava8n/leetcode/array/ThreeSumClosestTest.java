package com.github.sava8n.leetcode.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumClosestTest {

    @ParameterizedTest
    @MethodSource("cases")
    void check_case(int[] nums, int target, int expected) {
        var result = new ThreeSumClosest().solve(nums, target);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[]{-1, 2, 1, -4}, 1, 2),
                Arguments.of(new int[]{0, 0, 0}, 1, 0)
        );
    }
}
