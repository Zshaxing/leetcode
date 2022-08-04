package com.shaxing.leetcode.code.hundred.array;

public class TotalFruit {
    public static void main(String[] args) {
        int i = new TotalFruit().totalFruit(new int[]{1,0,1,4,1,4,1,2,3});
        System.out.println(i);
    }
    public int totalFruit(int[] fruits) {
        int length = fruits.length;
        if (0 == length) {
            return 0;
        }
        int winOneStartIndex = 0;
        int winTwoStartIndex = 0;
        int lanOneValue = fruits[0];
        int lanTwoValue = fruits[0];
        int result = 0;
        for (int i = 0; i < length; i++) {
            // 外层window
            if (fruits[i] != lanOneValue && fruits[i] != lanTwoValue) {
                lanOneValue = lanTwoValue;
                lanTwoValue = fruits[i];
                winOneStartIndex = winTwoStartIndex;
                winTwoStartIndex = i;
            } else if (fruits[i] != lanTwoValue) {
                lanOneValue ^= lanTwoValue;
                lanTwoValue ^= lanOneValue;
                lanOneValue ^= lanTwoValue;
                winTwoStartIndex = i;
            }
            result = Math.max(result, i - winOneStartIndex + 1);
        }
        return result;
    }
}
