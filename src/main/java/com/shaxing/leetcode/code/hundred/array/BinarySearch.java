package com.shaxing.leetcode.code.hundred.array;

public class BinarySearch {
    public static void main(String[] args) {
        int search = new BinarySearch().search(new int[]{1,3,5,6}, 2);
        System.out.println(search);
    }

    private int search(int[] nums, int target) {
        int length = nums.length;
        if (length==0) {
            return -1;
        }
        int left = 0;
        int right = length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
