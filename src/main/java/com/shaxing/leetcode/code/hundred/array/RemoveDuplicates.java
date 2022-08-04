package com.shaxing.leetcode.code.hundred.array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int i = new RemoveDuplicates().removeDuplicates(new int[]{1, 1, 1, 2});
        System.out.println(i);
    }
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (0 == length) {
            return 0;
        }
        if (1 == length) {
            return 1;
        }
        int valid = 0;
        for (int i = 1; i < length; i++) {
            if (nums[valid] == nums[i]) {
                continue;
            }
            if (valid + 1 < i) {
                nums[valid+1] = nums[i];
            }
            valid++;
        }
        return valid + 1;
    }

    private void swap(int[] nums, int valid, int i) {
        nums[valid] ^= nums[i];
        nums[i] ^= nums[valid];
        nums[valid] ^= nums[i];
    }
}
