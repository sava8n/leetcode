package com.github.sava8n.leetcode.math;

/**
 * Problem: <a href="https://leetcode.com/problems/palindrome-number">Palindrome Number</a>
 * Difficulty: Easy
 */
public class PalindromeNumber {
    public boolean solve(int x) {
        if (x < 0)
            return false;

        int rev = 0;
        int n = x;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        return (rev == x);
    }
}
