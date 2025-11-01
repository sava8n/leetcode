package com.github.sava8n.leetcode.dp;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegularExpressionMatchingTest {

    @ParameterizedTest
    @MethodSource("cases")
    void check_case(String s, String p, boolean expected) {
        var result = new RegularExpressionMatching().solve(s, p);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of("aa", "a", false),
                Arguments.of("aa", "a*", true),
                Arguments.of("ab", ".*", true)
        );
    }
}
