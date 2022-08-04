package com.shaxing.leetcode.code.hundred.array;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 0, 13};
        new MoveZeroes().moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        if (0 == length) {
            return;
        }
        int valid = 0;
        for (int i = 0; i < length; i++) {
            if (0 == nums[i]) {
                continue;
            }
            if (valid < i) {
                swap(nums, valid , i);
            }
            valid++;
        }
    }

    private void swap(int[] nums, int valid, int i) {
        nums[valid] ^= nums[i];
        nums[i] ^= nums[valid];
        nums[valid] ^= nums[i];
    }

}
