package com.shaxing.leetcode.code.arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length==0) {
            return 0;
        }
        int invalidIndex = 1;
        for (int i = 0; i < length-1; i++) {
            if (nums[i] == nums[i+1]) {
                continue;
            }
            if (invalidIndex < i+1) {
                nums[invalidIndex] = nums[i+1];
            }
            invalidIndex++;
        }
        return invalidIndex;
    }

    public static void main(String[] args) {
        int k = new RemoveDuplicates().removeDuplicates(new int[]{});
        System.out.println(k);

    }
}
