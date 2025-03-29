package com.github.sava8n.leetcode.linked_list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AddTwoNumbersTest {

    @ParameterizedTest
    @MethodSource("cases")
    void check_case(ListNode l1, ListNode l2, ListNode expected) {
        var result = new AddTwoNumbers().solve(l1, l2);
        assertArrayEquals(ListNode.toArray(expected), ListNode.toArray(result));
    }

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(
                        ListNode.from(new int[] { 2, 4, 3 }),
                        ListNode.from(new int[] { 5, 6, 4 }),
                        ListNode.from(new int[] { 7, 0, 8 })
                ),
                Arguments.of(
                        ListNode.from(new int[] { 0 }),
                        ListNode.from(new int[] { 0 }),
                        ListNode.from(new int[] { 0 })
                ),
                Arguments.of(
                        ListNode.from(new int[] { 9, 9, 9, 9, 9, 9, 9 }),
                        ListNode.from(new int[] { 9, 9, 9, 9 }),
                        ListNode.from(new int[] { 8, 9, 9, 9, 0, 0, 0, 1 })
                )
        );
    }
}
