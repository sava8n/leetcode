package com.github.sava8n.leetcode.string;

/**
 * Problem: <a href="https://leetcode.com/problems/longest-common-prefix">Longest Common Prefix</a>
 * Difficulty: Easy
 */
public class LongestCommonPrefix {
    public String solve(String[] strs) {
        var res = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            for (String s : strs) {
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i))
                    return res.toString();
            }

            res.append(strs[0].charAt(i));
        }

        return res.toString();
    }
}
