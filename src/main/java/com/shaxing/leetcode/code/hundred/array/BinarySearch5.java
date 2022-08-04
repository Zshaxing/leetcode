package com.shaxing.leetcode.code.hundred.array;

public class BinarySearch5 {
    public static void main(String[] args) {
        boolean i = new BinarySearch5().isPerfectSquare(5);
        System.out.println(i);
    }
    private boolean isPerfectSquare(int num) {
        if (0==num || 1==num) {
            return true;
        }
        int left = 1;
        int right = num;
        int mid;

        while (left<=right) {
            mid = left + ((right - left)/2);
            if (mid == num / mid && mid * mid == num) {
                return true;
            } else if (mid > num / mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
