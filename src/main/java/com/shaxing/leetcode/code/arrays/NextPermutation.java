package com.shaxing.leetcode.code.arrays;

public class NextPermutation {
//    1 5 3 6 5 2 2
//    1 5 5 2 2 3 6
    public void nextPermutation(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return;
        }
        int i = length - 2;
        int j;
        while (i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if (i>=0) {
            j = length - 1;
            while (nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1);
    }

   private void swap(int[] nums, int front, int post) {
        nums[front] ^= nums[post];
        nums[post] ^= nums[front];
        nums[front] ^= nums[post];
   }

   private void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
   }

    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 6, 5, 2, 2};
        new NextPermutation().nextPermutation(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
