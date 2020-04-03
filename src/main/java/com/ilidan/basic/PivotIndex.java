package com.ilidan.basic;

/**
 * 寻找数组的中心索引
 */
public class PivotIndex {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, -1, -1, 0, 1, 1};
        int i = pivotIndex(nums);
        System.out.println(i);
    }

    /**
     * 查找中心索引
     * @param nums 数组
     * @return 中心索引
     */
    public static int pivotIndex(int[] nums) {

        if (nums == null || nums.length <= 2) {
            return -1;
        }

        //求出总和
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int length = nums.length;
        int left = 0;
        for (int i = 0; i < length; i++) {
            if (total - nums[i] - left == left) {
                return i;
            }
            left += nums[i];

        }
        return -1;
    }
}
