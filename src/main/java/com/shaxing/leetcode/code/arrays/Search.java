package com.shaxing.leetcode.code.arrays;

public class Search {
    /**
     * 4 5 6 7 0 1
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                if (nums[right] < target && nums[mid] <= nums[right]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[left] > target && nums[mid] >= nums[left]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int search = new Search().search(new int[]{4, 1}, 1);
        System.out.println(search);
    }
}
