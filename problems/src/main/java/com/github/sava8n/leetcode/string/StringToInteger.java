package com.github.sava8n.leetcode.string;

/**
 * Problem: <a href="https://leetcode.com/problems/string-to-integer-atoi">String to Integer</a>
 * Difficulty: Medium
 */
public class StringToInteger {
    public int solve(String s) {
        s = s.stripLeading();

        if (s.isEmpty()) {
            return 0;
        }

        int min = 1 << 31;       // -2^31
        int max = (1 << 31) - 1; // 2^31 - 1

        int i = 0;
        int n = s.length();

        int sign = 1;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        long res = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;

            if (sign * res <= min)
                return min;
            if (sign * res >= max)
                return max;

            i++;
        }

        return (int)(res * sign);
    }
}
