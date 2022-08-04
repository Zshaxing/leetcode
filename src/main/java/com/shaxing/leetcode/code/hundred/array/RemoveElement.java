package com.shaxing.leetcode.code.hundred.array;

public class RemoveElement {
    public static void main(String[] args) {
        int i = new RemoveElement().removeElement(new int[]{1, 2, 3, 4, 5}, 1);
        System.out.println(i);
    }
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }

        int valid = 0;
        for (int i = 0; i < length; i++) {
            if (val == nums[i]) {
                continue;
            }
            if (valid < i) {
                swap(nums, valid, i);
            }
            valid++;
        }
        return valid;
    }

    private void swap(int[] nums, int valid, int i) {
        nums[valid] ^= nums[i];
        nums[i] ^= nums[valid];
        nums[valid] ^= nums[i];
    }
}
