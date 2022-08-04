package com.shaxing.leetcode.code.hundred.array;

public class MinSubArrayLen {
    public static void main(String[] args) {
        int i = new MinSubArrayLen().minSubArrayLen(7, new int[]{9});
        System.out.println(i);
    }
    public int minSubArrayLen(int target, int[] nums) {
        int length = nums.length;
        if (0 == length) {
            return 0;
        }
        int j = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            currentSum += nums[i];
            while (currentSum >= target) {
                minLength = Math.min(minLength, i-j+1);
                currentSum -= nums[ j++];
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
