package com.shaxing.leetcode.code.hundred.array;

public class SortedSquares {
    public static void main(String[] args) {
        int[] ints = new SortedSquares().sortedSquares(new int[]{-4,-1,0,3,10});
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        if (0 == length) {
            return new int[]{};
        }
        int left = 0, right = length-1;
        int[] result = new int[length];
        int loop = length - 1;
        while (left<=right) {
            if (nums[left]*nums[left] >= nums[right]*nums[right]) {
                result[loop--] = nums[left] * nums[left];
                left++;
            } else {
                result[loop--] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}
