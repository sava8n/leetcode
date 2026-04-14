package com.github.sava8n.leetcode.arays_and_strings;

/**
 * Problem: <a href="https://leetcode.com/problems/squares-of-a-sorted-array">Squares of a Sorted Array</a>
 * Difficulty: Easy
 */
public class SquaresOfASortedArray {
    public int[] solve(int[] nums) {
        int l = 0, r = nums.length - 1;
        int[] res = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            int num;
            if (Math.abs(nums[l]) < Math.abs(nums[r])) {
                num = nums[r];
                r--;
            }
            else {
                num = nums[l];
                l++;
            }

            res[i] = num * num;
        }

        return res;
    }
}
