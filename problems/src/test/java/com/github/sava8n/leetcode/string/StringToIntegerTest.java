package com.github.sava8n.leetcode.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToIntegerTest {

    @ParameterizedTest
    @MethodSource("cases")
    void check_case(String x, int expected) {
        var result = new StringToInteger().solve(x);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of("42", 42),
                Arguments.of(" -042", -42),
                Arguments.of("1337c0d3", 1337),
                Arguments.of("0-1", 0),
                Arguments.of("words and 987", 0)
        );
    }
}
