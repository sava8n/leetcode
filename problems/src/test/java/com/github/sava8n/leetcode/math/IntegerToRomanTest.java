package com.github.sava8n.leetcode.math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerToRomanTest {

    @ParameterizedTest
    @MethodSource("cases")
    void check_case(int num, String expected) {
        var result = new IntegerToRoman().solve(num);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(3749, "MMMDCCXLIX"),
                Arguments.of(58, "LVIII"),
                Arguments.of(1994, "MCMXCIV")
        );
    }
}
