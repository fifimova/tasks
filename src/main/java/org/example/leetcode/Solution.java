package org.example.leetcode;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] result;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + nums[i] == target) {
                return result = new int[]{i, i};
            }
            
        }
        return null;
    }
}
