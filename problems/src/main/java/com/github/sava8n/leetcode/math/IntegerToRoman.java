package com.github.sava8n.leetcode.math;

/**
 * Problem: <a href="https://leetcode.com/problems/integer-to-roman">Integer to Roman</a>
 * Difficulty: Medium
 */
public class IntegerToRoman {
    public String solve(int num) {
        var values = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        var symbols = new String[] {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        var res = new StringBuilder();
        for (var i = 0; i < values.length; i++) {
            if(num == 0)
                break;

            var times = num / values[i];
            while(times > 0) {
                res.append(symbols[i]);
                times -= 1;
            }

            num = num % values[i];
        }


        return res.toString();
    }
}
