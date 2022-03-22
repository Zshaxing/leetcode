package com.shaxing.leetcode.code;

public class FirstMissingPositive {
  public static void main(String[] args) {
    int number = new FirstMissingPositive().fetchResult(new int[] {1,1});
    System.out.println(number);
  }

  private int fetchResult(int[] nums) {
    int length = nums.length;
    for (int i = 0; i < length; i++) {
      if (nums[i] <= 0 || nums[i] > length) {
        nums[i] = length + 1;
      }
    }

    for (int i = 0; i < length; i++) {
      int abs = Math.abs(nums[i]);
      if (abs != length + 1) {
        int index = abs - 1;
        if (nums[index] > 0) {
          nums[index] = -nums[index];
        }
      }
    }

    for (int i = 0; i < length; i++) {
      if (nums[i] > 0) {
        return i + 1;
      }
    }
    return length + 1;
  }
}
