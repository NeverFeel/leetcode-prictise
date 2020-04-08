package com.ilidan.utils;

import java.util.Arrays;

/**
 * 打印工具类
 * @author ilidan
 */ 
public class PrintUtil {

    /**
     * 打印int数组
     * @param nums 数组
     */
    public static void printIntArray(int[] nums) {
        if (nums == null) {
            return;
        }
        System.out.println(Arrays.toString(nums));
    }

}
