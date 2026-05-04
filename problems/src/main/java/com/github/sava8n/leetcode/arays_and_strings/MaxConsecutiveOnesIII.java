package com.github.sava8n.leetcode.arays_and_strings;

/**
 * Problem: <a href="https://leetcode.com/problems/max-consecutive-ones-iii">Max Consecutive Ones III</a>
 * Difficulty: Medium
 */
public class MaxConsecutiveOnesIII {
    public int solve(int[] nums, int k) {
        int l = 0, curr = 0, ans = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                curr++;
            }

            while (curr > k) {
                if (nums[l] == 0) {
                    curr--;
                }

                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}
