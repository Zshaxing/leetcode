package com.shaxing.leetcode.code.dynamic_programming;

public class Trap {
    public int trap(int[] height) {
        int length = height.length;
        int left = 0;
        int right = length - 1;
        int leftMax = height[0];
        int rightMax = height[length-1];
        int res = 0;
        while (left < right) {
            if (height[left] > leftMax) {
                leftMax = height[left];
            }
            if (height[right] > rightMax) {
                rightMax = height[right];
            }
            if (height[left] < height[right]) {
                res += leftMax - height[left];
                left++;
            } else {
                res += rightMax - height[right];
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Trap().trap(new int[]{4,2,0,3,2,5}));
    }
}
