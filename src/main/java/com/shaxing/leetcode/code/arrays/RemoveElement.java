package com.shaxing.leetcode.code.arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int fast = 0, slow = 0;
        while(fast < length) {
            if (nums[fast] == val) {
                fast++;
                continue;
            }
            if (slow != fast) {
                nums[slow] = nums[fast];
            }
            fast++;
            slow++;
            soutNums(nums);
        }
        return slow;
    }

    private void soutNums(int[] nums) {
        int length = nums.length;
        String result = "";
        for (int i = 0; i < length; i++) {
            result = result + nums[i];
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int k = new RemoveElement().removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
        System.out.println(k);
    }
}
