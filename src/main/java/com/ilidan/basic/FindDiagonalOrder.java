package com.ilidan.basic;

/**
 * 对角线遍历
 * @author ilidan
 */
public class FindDiagonalOrder {

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,2,3},{4,5,6}};
        int[] diagonalOrder = findDiagonalOrder(nums);

        for(int item : diagonalOrder){
            System.out.println(item);
        }

    }

    private static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null) {
            return null;
        }

        int length = matrix.length;
        int[] nums = matrix[0];
        int itemLength = nums.length;
        int[] returnNums = new int[length * itemLength];

        int returnIndex = 0;
        int readCount = length + itemLength - 1;
        for (int i = 0; i < readCount; i++) {
            int m = i;
            int n = 0;
            if(i > itemLength){
                n = i-itemLength;
            }
            while (m >= 0 && n<=i){
                returnNums[returnIndex++] = matrix[n][m];
                m--;
                n++;
            }
        }

        return returnNums;
    }

}
