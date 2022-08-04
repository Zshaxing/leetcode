package com.shaxing.leetcode.code.hundred.array;

public class GenerateMatrix {
    public static void main(String[] args) {
        int[][] ints = new GenerateMatrix().generateMatrix(3);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                System.out.println(ints[i][j]);
            }
        }
    }
    public int[][] generateMatrix(int n) {
        int start = 0;
        int loop = 0;
        int[][] res = new int[n][n];
        int count = 1;
        int i,j;
        while (loop++ < n / 2) {
            // 上
            for (j = start; j < n - loop; j++) {
                res[start][j] = count++;
            }

            // 右
            for (i = start; i < n - loop; i++) {
                res[i][j] = count++;
            }

            // 下
            for (; j >= loop; j--) {
                res[i][j] = count++;
            }

            // 左
            for (; i >= loop; i--) {
                res[i][j] = count++;
            }
            start++;
        }
        if (n % 2 == 1) {
            res[start][start] = count;
        }
        return res;
    }
}
