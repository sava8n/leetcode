package com.github.sava8n.leetcode.binary_search;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArraysTest {

    @ParameterizedTest
    @MethodSource("cases")
    void check_case(int[] nums1, int[] nums2, double expected) {
        var result = new MedianOfTwoSortedArrays().solve(nums1, nums2);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[] {1, 3}, new int[] {2}, 2.0),
                Arguments.of(new int[] {1, 2}, new int[] {3, 4}, 2.5)
        );
    }
}
