package com.shaxing.leetcode.code.hundred.array;

public class BinarySearch4 {
    public static void main(String[] args) {
        int i = new BinarySearch4().mySqrt(1);
        System.out.println(i);
    }
    private int mySqrt(int x) {
        if (0==x || 1==x) {
            return x;
        }
        int left = 1;
        int right = x;
        int mid, result=0;

        while (left<=right) {
            mid = left + ((right - left)/2);
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                result = mid;
                left = mid + 1;
            }
        }
        return result;
    }
}
