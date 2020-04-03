package com.ilidan.basic;

/**
 * 至少是其他数字两倍的最大数
 */
public class DominantIndex {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 6, 1, 0};

        System.out.println(dominantIndex(nums));

    }

    private static int dominantIndex(int[] nums) {
        //临界值判断
        if (nums == null || nums.length < 1) {
            return -1;
        }

        if(nums.length == 1){
            return 0;
        }

        //先找出最大的元素
        int max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

//        System.out.printf("当前数组最大元素为%s, 索引为:%s\n", max, index);

        //校验当前最大元素是否是其他元素的2倍大
        for (int i = 0; i < nums.length; i++) {
            if(i == index){
                continue;
            }
            if(nums[i]*2 > max){
                return  -1;
            }
        }
        return index;
    }

}
