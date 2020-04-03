package com.ilidan.utils;
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

        for (int num : nums) {
            System.out.println(num);
        }
    }

}
