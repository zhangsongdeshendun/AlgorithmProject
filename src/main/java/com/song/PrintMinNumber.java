package com.song;


import java.util.*;

/**
 * 题目：题目：输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * <p>
 * <p>
 * 两种解题思路：1.先求出这个数组中所有数字的全排列，然后把每个排列拼起来，最后求出拼起来的数字的最大值。
 */

public class PrintMinNumber {

    public static List<Integer> list = new ArrayList<Integer>();

    public static void permutation(int[] array) {

        if (array == null || array.length < 1) {
            return;
        }
        permutation(array, 0);

    }

    public static void permutation(int[] array, int start) {
        if (start == array.length - 1) {
//            System.out.println(Arrays.toString(array));

            StringBuilder tem = new StringBuilder();
            for (int x : array) {
                tem.append(x);
            }
            int result = Integer.valueOf(tem.toString());
            list.add(result);
            if (list.size() == getPermutationNum(array.length)) {
                Collections.sort(list);
                System.out.println(list.get(0));
            }

            return;
        } else {
            int x;
            for (int i = start; i < array.length; i++) {
                x = array[start];
                array[start] = array[i];
                array[i] = x;
                permutation(array, start + 1);
                //恢复前面的变化
                x = array[start];
                array[start] = array[i];
                array[i] = x;
            }
        }


    }

    /**
     * 获得一个长度是num的数列的排列组合个数
     *
     * @param num
     * @return
     */
    public static int getPermutationNum(int num) {
        int result = 1;
        for (int i = num; i > 1; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] x = {3, 32, 321};
        permutation(x);
    }


}
