package com.github.sava8n.leetcode.binary_search;

/**
 * Problem: <a href="https://leetcode.com/problems/median-of-two-sorted-arrays">Median of Two Sorted Arrays</a>
 * Difficulty: Hard
 */
public class MedianOfTwoSortedArrays {
    public double solve(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return solve(nums2, nums1);
        }

        int m = nums1.length, n = nums2.length;
        int l = 0, r = m;

        while (l <= r) {
            int a = (l + r) / 2;
            int b = (m + n + 1) / 2 - a;

            // A left partition max
            int alm = (a == 0) ? Integer.MIN_VALUE : nums1[a - 1];
            // A right partition min
            int arm = (a == m) ? Integer.MAX_VALUE : nums1[a];
            // B left partition max
            int blm = (b == 0) ? Integer.MIN_VALUE : nums2[b - 1];
            // B right partition min
            int brm = (b == n) ? Integer.MAX_VALUE : nums2[b];

            if (alm <= brm && blm <= arm) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(alm, blm) + Math.min(arm, brm)) / 2.0;
                }
                else {
                    return Math.max(alm, blm);
                }
            }
            else if (alm > brm) {
                r = a - 1;
            }
            else {
                l = a + 1;
            }
        }

        throw new IllegalArgumentException("Wrong input!");
    }
}
