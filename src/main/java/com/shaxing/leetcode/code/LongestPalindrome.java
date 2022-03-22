package com.shaxing.leetcode.code;

public class LongestPalindrome {
    public static void main(String[] args) {
        String result = new LongestPalindrome().fetchResult("2211122");
        System.out.println(result);
    }

    private String fetchResult(String s) {
        if (null == s || s.length() == 0) {
            return "";
        }

        char[] chars = s.toCharArray();
        int[] range = new int[2];
        for (int i = 0; i < chars.length - 1; i++) {
            i = findLongestPalindrome(chars, i, range);
        }
        return s.substring(range[0], range[1]+1);
    }

    private int findLongestPalindrome(char[] chars, int low, int[] range) {
        int high = low;
        while (high < chars.length - 1 && chars[low] == chars[high+1]) {
            high++;
        }

        int res = high;
        while (low > 0 && high < chars.length - 1 && chars[low-1] == chars[high+1]) {
            high++;
            low--;
        }

        if ((high-low) > (range[1]-range[0])) {
            range[0] = low;
            range[1] = high;
        }
        return res;
    }
}
