package com.github.sava8n.leetcode.arays_and_strings;

/**
 * Problem: <a href="https://leetcode.com/problems/reverse-string">Reverse String</a>
 * Difficulty: Easy
 */
public class ReverseString {
    public void solve(char[] s) {
        int l = 0, r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;

            l++;
            r--;
        }
    }
}
