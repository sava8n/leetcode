package com.github.sava8n.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Problem: <a href='https://leetcode.com/problems/letter-combinations-of-a-phone-number'>Letter Combinations of a Phone Number</a>
 * Difficulty: Medium
 */
public class LetterCombinationsOfAPhoneNumber {
    public List<String> solve(String digits) {
        var map = Map.of(
                '2', "abc",
                '3', "def",
                '4', "ghi",
                '5', "jkl",
                '6', "mno",
                '7', "pqrs",
                '8', "tuv",
                '9', "wxyz"
        );

        var res = new ArrayList<String>();
        backtrack(digits, 0, new StringBuilder(), res, map);

        return res;
    }

    private void backtrack(String digits, int i, StringBuilder c, List<String> res, Map<Character, String> map) {
        if (i == digits.length()) {
            res.add(c.toString());
            return;
        }

        var letters = map.get(digits.charAt(i));
        for (char letter : letters.toCharArray()) {
            c.append(letter);
            backtrack(digits, i + 1, c, res, map);
            c.deleteCharAt(c.length() - 1);
        }
    }
}
