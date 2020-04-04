package com.ilidan.basicsort;

import com.ilidan.utils.PrintUtil;

/**
 * 选择排序
 * @author ilidan
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,6,4,7,5,9};
        PrintUtil.printIntArray(selectionSort(nums));
    }

    /**
     * 选择排序
     * @param nums 待排序的数组
     * @return 已经排序好的数组
     */
    private static int[] selectionSort(int[] nums) {
        if (nums == null) {
            return new int[0];
        }
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i+1; j < length; j++) {
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            //交换
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        return nums;
    }

}
