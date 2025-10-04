package com.github.sava8n.leetcode.math;

/**
 * Problem: <a href="https://leetcode.com/problems/reverse-integer">Reverse Integer</a>
 * Difficulty: Medium
 */
public class ReverseInteger {
    public int solve(int x) {
        int min = 1 << 31;       // -2^31
        int max = (1 << 31) - 1; // 2^31 - 1

        int res = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            if (res > max / 10 || (res == max / 10 && digit > 7))
                return 0;
            if (res < min / 10 || (res == min / 10 && digit < -8))
                return 0;

            res = res * 10 + digit;
        }

        return res;
    }
}
