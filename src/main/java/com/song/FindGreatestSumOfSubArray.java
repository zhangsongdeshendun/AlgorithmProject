package com.song;

/**
 * 输入一个整型数组，数组里有正数也有负数。数组中一个或连
 * 续的多个整数组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为O(n)。
 */

public class FindGreatestSumOfSubArray {

    public static int findGreatestSumOfSubArray(int[] array) {

        int sumMax = array[0];
        int currentMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (currentMax <= 0) {
                currentMax = array[i];
            } else {
                currentMax += array[i];
            }
            if (sumMax < currentMax) {
                sumMax = currentMax;
            }
        }

        return sumMax;

    }

    public static void main(String[] args){
        int[] data = {1, -2, 3, 10, -4, 7, 2, -5};
        int[] data2 = {-2, -8, -1, -5, -9};
        int[] data3 = {2, 8, 1, 5, 9};

        System.out.println(findGreatestSumOfSubArray(data));
        System.out.println(findGreatestSumOfSubArray(data2));
        System.out.println(findGreatestSumOfSubArray(data3));
    }


}
