package com.ilidan.basicsort;

import com.ilidan.utils.PrintUtil;

/**
 * 快速排序
 * @author ilidan
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        quickSort(arr);
        PrintUtil.printIntArray(arr);
    }

    /**
     * 快速排序
     * @param nums 数组信息
     */
    private static void quickSort(int[] nums) {
        doQuickSort(nums, 0, nums.length - 1);
    }

    /**
     * 排序
     * @param nums 数组
     * @param beginIndex 开始索引位置
     * @param endIndex 结束索引位置
     */
    private static void doQuickSort(int[] nums, int beginIndex, int endIndex) {
        if (beginIndex >= endIndex) {
            return;
        }

        //分区
        int partitionIndex = partition(nums, beginIndex, endIndex);
        doQuickSort(nums, beginIndex, partitionIndex - 1);
        doQuickSort(nums, partitionIndex + 1, endIndex);
    }

    /**
     * 分区排序
     * @param nums 数组信息
     * @param beginIndex 开始索引
     * @param endIndex 结束索引
     * @return 分区点所在的索引位置
     */
    private static int partition(int[] nums, int beginIndex, int endIndex) {
        int pivot = nums[endIndex];
        int i = beginIndex;
        for (int j = beginIndex; j < endIndex; j++) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, endIndex);
        return i;
    }

    /**
     * 交换数据
     * @param nums 数组信息
     * @param i 交换索引i
     * @param j 交换索引j
     */
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
