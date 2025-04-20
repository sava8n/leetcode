package com.github.sava8n.leetcode.string;

import java.util.HashSet;

/**
 * Problem: <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">Longest Substring Without Repeating Characters</a>
 * Difficulty: Medium
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int solve(String s) {
        int p1 = 0, p2 = 0, max = 0;

        var set = new HashSet<Character>();
        while (p2 < s.length()) {
            var ch = s.charAt(p2);
            if (!set.contains(ch)) {
                set.add(ch);
                p2++;
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(p1));
                p1++;
            }
        }

        return max;
    }
}
