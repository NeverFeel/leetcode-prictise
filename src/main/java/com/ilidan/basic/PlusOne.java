package com.ilidan.basic;

import com.ilidan.utils.PrintUtil;

/**
 * 加一
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] nums = new int[]{9, 9, 9, 9};
        PrintUtil.printIntArray(plusOne(nums));
    }

    public static int[] plusOne(int[] digits) {
        if (digits == null) {
            return new int[]{};
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
}
