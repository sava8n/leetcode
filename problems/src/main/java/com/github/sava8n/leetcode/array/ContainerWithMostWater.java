package com.github.sava8n.leetcode.array;

/**
 * Problem: <a href="https://leetcode.com/problems/container-with-most-water">Container With Most Water</a>
 * Difficulty: Medium
 */
public class ContainerWithMostWater {
    public int solve(int[] height) {
        int lp = 0;
        int rp = height.length - 1;
        int res = 0;

        while (lp < rp) {
            int w = rp - lp;
            int h = Math.min(height[lp], height[rp]);
            res = Math.max(res, w * h);

            if (height[lp] < height[rp])
                lp++;
            else
                rp--;
        }

        return res;
    }
}
