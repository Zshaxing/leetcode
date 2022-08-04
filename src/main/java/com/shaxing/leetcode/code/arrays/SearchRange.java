package com.shaxing.leetcode.code.arrays;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int length = nums.length;
        if (0 == length) {
            return new int[]{-1, -1};
        }
        int leftIndex = binarySearch(nums, target, true);
        if (leftIndex == -1 || nums[leftIndex] != target) {
            return new int[]{-1, -1};
        }
        int rightIndex = binarySearch(nums, target, false);
        if (rightIndex == -1) {
            rightIndex = length;
        }
        return new int[]{leftIndex, rightIndex - 1};
    }

    private int binarySearch(int[] nums, int target, boolean needEqual) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        int res = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] > target || (needEqual && nums[mid] == target)) {
                right = mid - 1;
                res = mid;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = new SearchRange().searchRange(new int[]{3}, 3);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
