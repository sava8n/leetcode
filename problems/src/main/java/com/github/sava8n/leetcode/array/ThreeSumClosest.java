package com.github.sava8n.leetcode.array;

import java.util.Arrays;

/**
 * Problem: <a href="https://leetcode.com/problems/3sum-closest">3Sum Closest</a>
 * Difficulty: Medium
 */
public class ThreeSumClosest {
    public int solve(int[] nums, int target) {
        Arrays.sort(nums);

        var n = nums.length;
        var res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            var l = i + 1;
            var h = n - 1;

            while (l < h) {
                var sum = nums[i] + nums[l] + nums[h];

                if (Math.abs(target - sum) < Math.abs(target - res))
                    res = sum;

                if (sum == target)
                    return sum;
                else if (sum < target)
                    l++;
                else
                    h--;
            }
        }

        return res;
    }
}
