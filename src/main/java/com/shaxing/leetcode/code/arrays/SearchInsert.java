package com.shaxing.leetcode.code.arrays;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        if (0 == length) {
            return 0;
        }

        int left = 0;
        int right = length - 1;
        int mid;
        int res = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
                res = mid;
            } else {
                left = mid + 1;
            }
        }
        if (-1 == res) {
            return length;
        }
        return res;
    }

    public static void main(String[] args) {
        int i = new SearchInsert().searchInsert(new int[]{1,3,5,6}, 7);
        System.out.println(i);
    }
}
