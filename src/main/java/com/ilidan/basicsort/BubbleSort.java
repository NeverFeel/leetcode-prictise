package com.ilidan.basicsort;

/**
 * 冒泡排序
 * @author ilidan
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = new int[]{
            1, 3, 4, 2, 5, 6
        };

        int[] sortedNums = bubbleSort(nums);
        for (int item : sortedNums) {
            System.out.println(item);
        }

    }

    /**
     * 排序
     * @return 已经排序好的数组
     */
    private static int[] bubbleSort(int[] nums) {
        if (nums == null) {
            return null;
        }

        int length = nums.length;
        boolean hasSorted = false;
        for (int i = 0; i < length; i++) {
            System.out.printf("第%s次操作\n", (i+1));
            for (int j = 0; j < length - i - 1; j++) {
                if (nums[j] > nums[j+1]) {
                    swap(j, j+1, nums);
                    hasSorted = true;
                }
            }
            if (!hasSorted) {
                System.out.println("已经是排序好的数组");
                break;
            }
        }
        return nums;
    }

    /**
     * 元素交换
     * @param indexI 第一个索引位
     * @param indexJ 第二个索引位
     * @param nums 数量
     */
    private static void swap(int indexI, int indexJ, int[] nums) {
        int temp = nums[indexI];
        nums[indexI] = nums[indexJ];
        nums[indexJ] = temp;
    }

}
