package com.shaxing.leetcode.code.arrays;

public class FirstMissingPositive {
  public static void main(String[] args) {
    int number = new FirstMissingPositive().fetchResult(new int[] {3,4,-1,1});
    System.out.println(number);
  }

  private int fetchResult(int[] nums) {
    int length = nums.length;
    for (int i = 0; i < length; i++) {
      if (nums[i] == i + 1 || 0 >= nums[i] || length < nums[i]) {
        continue;
      }
      while (0 < nums[i] && length >= nums[i]) {
        if (nums[i] == nums[nums[i]-1]) {
            break;
        }
        swap(nums, i, nums[i] - 1);
      }
    }

    for (int j = 0; j < length; j++) {
      if (nums[j] != j + 1) {
        return j + 1;
      }
    }
    return length + 1;
  }

  private void swap(int[] nums, int first, int second) {
    nums[first] ^= nums[second];
    nums[second] ^= nums[first];
    nums[first] ^= nums[second];
  }
}
