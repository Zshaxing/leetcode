package com.shaxing.leetcode.code.hundred.array;

public class BinarySearch3 {
    public static void main(String[] args) {
        int[] search = new BinarySearch3().search(new int[]{2,3,5,6}, 2);
        for (int i : search) {
            System.out.println(i);
        }
    }

    private int[] search(int[] nums, int target) {
        int leftBorder = getLeftBorder(nums, target);
        int rightBorder = getRightBorder(nums, target);
        if (leftBorder == -2 && rightBorder == -2) return new int[] {-1, -1};
        if (leftBorder < rightBorder - 1) return new int[]{leftBorder + 1, rightBorder - 1};
        return new int[] {-1, -1};
    }

    private int getLeftBorder(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        int mid, leftBorder = -2;
        while (left<=right) {
            mid = left + ((right - left) / 2);
            if (target <= nums[mid]) {
                right = mid - 1;
            } else {
                leftBorder = mid;
                left = mid + 1;
            }
        }
        return leftBorder;
    }

    private int getRightBorder(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        int mid, rightBorder = -2;
        while (left<=right) {
            mid = left + ((right - left) / 2);
            if (target < nums[mid]) {
                right = mid - 1;
            } else {
                rightBorder = mid;
                left = mid + 1;
            }
        }
        return rightBorder;
    }
}
