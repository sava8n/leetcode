package com.github.sava8n.leetcode.backtracking;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterCombinationsOfAPhoneNumberTest {

    @ParameterizedTest
    @MethodSource("cases")
    void check_case(String digits, List<String> expected) {
        var result = new LetterCombinationsOfAPhoneNumber().solve(digits);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of("23", List.of("ad","ae","af","bd","be","bf","cd","ce","cf")),
                Arguments.of("2", List.of("a","b","c"))
        );
    }
}
