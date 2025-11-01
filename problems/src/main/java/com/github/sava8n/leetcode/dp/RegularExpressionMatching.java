package com.github.sava8n.leetcode.dp;

/**
 * Problem: <a href="https://leetcode.com/problems/regular-expression-matching">Regular Expression Matching</a>
 * Difficulty: Hard
 */
public class RegularExpressionMatching {

    Boolean[][] memo;

    public boolean solve(String s, String p) {
        memo = new Boolean[s.length() + 1][p.length() + 1];
        return dfs(0, 0, s, p);
    }

    public boolean dfs(int i, int j, String s, String p) {
        if (memo[i][j] != null)
            return memo[i][j] == true;

        boolean res;
        var any = '.';
        var zom = '*';

        if (j == p.length())
            res = i == s.length();
        else {
            boolean match = i < s.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j) == any);
            if (j + 1 < p.length() && p.charAt(j + 1) == zom)
                res = dfs(i, j + 2, s, p) || (match && dfs(i + 1, j, s, p));
            else
                res = match && dfs(i + 1, j + 1, s, p);
        }

        memo[i][j] = res;

        return res;
    }
}
