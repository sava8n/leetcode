
package com.github.sava8n.leetcode.hash_table;

import java.util.HashMap;

/**
 * Problem: https://leetcode.com/problems/two-sum/description
 * Difficulty: Easy
 */
class TwoSum {
    public int[] solve(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int next = target - nums[i];
            if (map.containsKey(next)) {
                return new int[] {i, map.get(next)};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("Wrong input!");
    }
}
