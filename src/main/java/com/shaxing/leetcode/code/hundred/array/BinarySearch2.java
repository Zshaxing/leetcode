package com.shaxing.leetcode.code.hundred.array;

public class BinarySearch2 {
    public static void main(String[] args) {
        int search = new BinarySearch2().search(new int[]{1,3,5,6}, 7);
        System.out.println(search);
    }

    private int search(int[] nums, int target) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int left = 0;
        int right = length;
        int mid, index = 0;
        while (left<right) {
            mid = (left + right) / 2;
            if (target <= nums[mid]) {
                right = mid;
            } else {
                index = mid;
                left = mid + 1;
            }
        }
        return index + 1;
    }
}
