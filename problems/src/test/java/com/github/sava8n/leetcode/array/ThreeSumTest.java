package com.github.sava8n.leetcode.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumTest {

    @ParameterizedTest
    @MethodSource("cases")
    void check_case(int[] nums, List<List<Integer>> expected) {
        var result = new ThreeSum().solve(nums);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
                Arguments.of(new int[]{0, 1, 1}, List.of()),
                Arguments.of(new int[]{0, 0, 0}, List.of(List.of(0, 0, 0)))
        );
    }
}
