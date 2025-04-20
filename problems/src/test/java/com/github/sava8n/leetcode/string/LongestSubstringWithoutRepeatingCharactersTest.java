package com.github.sava8n.leetcode.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    @ParameterizedTest
    @MethodSource("cases")
    void check_case(String sting, int expected) {
        var result = new LongestSubstringWithoutRepeatingCharacters().solve(sting);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3)
        );
    }
}
