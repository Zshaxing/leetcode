package com.shaxing.leetcode.code.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeNumberSum {


  public static void main(String[] args) {
//    List<List<Integer>> ints = new ThreeNumberSum().fetchResult1(new int[] {-1,0,1,2,-1,-4});
    List<List<Integer>> result2 = new ThreeNumberSum().fetchResult2(new int[] {-1,0,1,2,-1,-4});
    System.out.println(result2);
  }

  public List<List<Integer>> fetchResult1(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    // 构造map
    HashMap<Integer, Integer> valueIndexMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      valueIndexMap.put(nums[i], i);
    }
    for (int i = 0; i < nums.length - 2; i++) {
      if (i>0 && nums[i] == nums[i-1]) {
        continue;
      }
      for (int j = i + 1; j < nums.length - 1; j++) {
        if (j>i+1 && nums[j] == nums[j-1]) {
          continue;
        }
        int target = - (nums[i] + nums[j]);
        if (valueIndexMap.containsKey(target) && valueIndexMap.get(target) > j ) {
          result.add(Arrays.asList(nums[i], nums[j], target));
        }
      }
    }
    return result;
  }

  public List<List<Integer>> fetchResult2(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    if (nums.length < 3 || nums[0] > 0) {
      return result;
    }

    for (int i = 0; i < nums.length; i++) {
      if (i > 0 && nums[i-1] == nums[i]) {
        continue;
      }
      int left = i + 1;
      int right = nums.length - 1;
      while (left < right) {
        int target = - (nums[left] + nums[right]);
        if ((right < nums.length - 1 && nums[right] == nums[right+1]) || target < nums[i]) {
          right--;
          continue;
        }
        if ((left> i+1 && nums[left] == nums[left-1]) || target > nums[i]) {
          left++;
          continue;
        }
        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
        left++;
        right--;
      }
    }
    return result;
  }
}
