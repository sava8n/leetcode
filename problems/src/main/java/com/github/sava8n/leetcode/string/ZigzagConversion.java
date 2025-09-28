package com.github.sava8n.leetcode.string;

/**
 * Problem: <a href="https://leetcode.com/problems/zigzag-conversion">Zigzag Conversion</a>
 * Difficulty: Medium
 */
public class ZigzagConversion {
    public String solve(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows)
            return s;

        var res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += (2 * (numRows - 1))) {
                res.append(s.charAt(j));
                if (i > 0 && i < numRows - 1 && j + (2 * (numRows - 1)) - (2 * i) < s.length()) {
                    res.append(s.charAt(j + (2 * (numRows - 1)) - (2 * i)));
                }
            }
        }

        return res.toString();
    }
}
