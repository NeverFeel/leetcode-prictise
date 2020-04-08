package com.ilidan.basicsort;

import com.ilidan.utils.PrintUtil;

import java.util.Arrays;

/**
 * 归并排序
 * @author ilidan
 */ 
public class MergeSort {

    public static void main(String[] args) {
        int []arr = {9,8,7,6,5,4,3,2,1};
        mergeSort(arr);
        PrintUtil.printIntArray(arr);
    }


    /**
     * 归并排序
     * @param nums 待排序的数组
     */
    private static void mergeSort(int[] nums){
        int length = nums.length;
        int[] temp = new int[length];
        mergeSortRecursive(nums, 0, length-1, temp);
    }

    /**
     * 归并合并
     * @param nums 数组信息
     * @param beginIndex 开始索引
     * @param endIndex 结束索引
     * @param temp 临时变量
     */
    private static void mergeSortRecursive(int[] nums, int beginIndex, int endIndex, int[] temp) {
        if (beginIndex >= endIndex) {
            return;
        }
        //取出中点
        int middleIndex = (beginIndex + endIndex) / 2;
        mergeSortRecursive(nums, beginIndex, middleIndex, temp);
        mergeSortRecursive(nums, middleIndex + 1, endIndex, temp);
        merge(nums, beginIndex, middleIndex, endIndex, temp);
    }

    /**
     * 合并
     * @param nums 数组信息
     * @param beginIndex 开始索引
     * @param middleIndex 中心索引
     * @param endIndex 结束索引
     * @param temp 临时变量
     */
    private static void merge(int[] nums, int beginIndex, int middleIndex, int endIndex, int[] temp) {
        //左序列指针
        int i = beginIndex;
        //右序列指针
        int j = middleIndex+1;
        //临时数组指针
        int t = 0;
        while (i<=middleIndex && j<=endIndex){
            if(nums[i]<=nums[j]){
                temp[t++] = nums[i++];
            }else {
                temp[t++] = nums[j++];
            }
            System.out.printf("当前开始索引%s, 结束索引%s，中间索引%s, 当前临时数组%s\n",
                    beginIndex, endIndex, middleIndex, Arrays.toString(temp));
        }
        while(i<=middleIndex){
            //将左边剩余元素填充进temp中
            temp[t++] = nums[i++];
        }
        while(j<=endIndex){
            //将右序列剩余元素填充进temp中
            temp[t++] = nums[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while(beginIndex <= endIndex){
            nums[beginIndex++] = temp[t++];
        }
    }
}
