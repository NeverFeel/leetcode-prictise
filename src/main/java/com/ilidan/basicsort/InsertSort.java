package com.ilidan.basicsort;

import com.ilidan.utils.PrintUtil;

/**
 * 插入排序
 * @author ilidan
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 6, 2, 3, 5};
        PrintUtil.printIntArray(insertSort(nums));
    }

    /**
     * 插入排序
     * @param nums 数组
     * @return 排序好的数组
     */
    private static int[] insertSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int j = (i - 1);
            for (; j >= 0; j--) {
                if (nums[j] > value) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }

            }
            nums[j + 1] = value;
        }
        return nums;
    }

}
