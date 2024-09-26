package com.github.sava8n.leetcode.hash_table;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @ParameterizedTest
    @MethodSource("cases")
    void check_for_case(int[] nums, int target, int[] expected) {
        var result = new TwoSum().solve(nums, target);
        Arrays.sort(result);

        assertArrayEquals(expected, result);
    }

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[] { 2, 7, 11, 15 }, 9, new int[] { 0, 1 }),
                Arguments.of(new int[] { 3, 2, 4 }, 6, new int[] { 1, 2 }),
                Arguments.of(new int[] { 3, 3 }, 6, new int[] { 0, 1 })
        );
    }
}
