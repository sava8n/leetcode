package com.github.sava8n.leetcode.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromicSubstringTest {

    @ParameterizedTest
    @MethodSource("cases")
    void check_case(String s, String expected) {
        var result = new LongestPalindromicSubstring().solve(s);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of("babad", "aba"),
                Arguments.of("cbbd", "bb")
        );
    }
}
