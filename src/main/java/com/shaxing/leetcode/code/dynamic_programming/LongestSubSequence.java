package com.shaxing.leetcode.code.dynamic_programming;

public class LongestSubSequence {
    public int[] longestSubSequence(int[] arr) {
        // arr[i] > arr[i-1] 时，i++
        // arr[i] <= arr[i-1] 时，
//          1.删除arr[i]，i++
//          2.删除arr[i-j]，until arr[i] > arr[i-j]
//        arr[i] = arr[i-1]
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] res = new LongestSubSequence().longestSubSequence(new int[]{});
        for (int re : res) {
            System.out.println(re);
        }
    }
}
