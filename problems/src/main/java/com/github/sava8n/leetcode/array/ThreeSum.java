package com.github.sava8n.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem: <a href="https://leetcode.com/problems/3sum">3Sum</a>
 * Difficulty: Medium
 */
public class ThreeSum {
    public List<List<Integer>> solve(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            if (nums[i] > 0)
                break;

            int l = i + 1, r = nums.length - 1;
            int t = -nums[i];

            while (l < r) {
                int sum = nums[l] + nums[r];
                if (sum == t) {
                    res.add(List.of(nums[i], nums[l], nums[r]));
                    l++;
                    r--;

                    while (l < r && nums[l] == nums[l - 1])
                        l++;
                    while (l < r && nums[r] == nums[r + 1])
                        r--;
                }
                else if (sum < t) {
                    l++;
                }
                else {
                    r--;
                }
            }
        }

        return res;
    }
}
