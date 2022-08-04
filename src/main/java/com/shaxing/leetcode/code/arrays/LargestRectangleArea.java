package com.shaxing.leetcode.code.arrays;

public class LargestRectangleArea {
//    todo fixme 未完成
    public int largestRectangleArea(int[] heights) {
        int length = heights.length;
        if (length == 0) {
            return 0;
        }
        int left = 0;
        int right = length-1;
        int maxArea = 0;
        int area;
        while (left<=right) {
            if (heights[left] <= heights[right]) {
                area = heights[left] * (right - left + 1);
                left++;
            } else {
                area = heights[right] * (right - left + 1);
                right--;
            }
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int i = new LargestRectangleArea().largestRectangleArea(new int[]{2,1,5,6,2,3});
        System.out.println(i);
    }
}
