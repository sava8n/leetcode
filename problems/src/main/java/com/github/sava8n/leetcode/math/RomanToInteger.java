package com.github.sava8n.leetcode.math;

import java.util.Map;

/**
 * Problem: <a href="https://leetcode.com/problems/roman-to-integer">Roman to Integer</a>
 * Difficulty: Easy
 */
public class RomanToInteger {
    public int solve(String s) {
        var map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        var res = 0;
        for (var i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i + 1)))
                res -= map.get(s.charAt(i));
            else
                res += map.get(s.charAt(i));
        }

        return res;
    }
}
