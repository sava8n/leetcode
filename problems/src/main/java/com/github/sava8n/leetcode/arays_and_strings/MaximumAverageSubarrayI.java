package com.github.sava8n.leetcode.arays_and_strings;

/**
 * Problem: <a href="https://leetcode.com/problems/maximum-average-subarray-i">Maximum Average Subarray I</a>
 * Difficulty: Easy
 */
public class MaximumAverageSubarrayI {
    public double solve(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++)
            sum += nums[i];

        double res = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            res = Math.max(res, sum);
        }

        return res / k;
    }
}
