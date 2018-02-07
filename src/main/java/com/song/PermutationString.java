package com.song;


/**
 * 题目：输入一个字符串，打印出该字符事中字符的所有排列。例如输入字符串abc。
 * 则打印出由字符a、b、c 所能排列出来的所有字符串abc、acb、bac、bca、cab和cba。
 * <p>
 * 待排序的字符数组
 * <p>
 * 思路：
 * 把一个字符串看成由两部分组成：第一部分为它的第一个字符，第二部分是后面的所有字符。在图4.14 中，我们用两种不同的背景颜色区分字符串的两部分。
 * <p>
 * 我们求整个字符串的排列，可以看成两步：首先求所有可能出现在第一个位置的字符，即把第一个字符和后面所有的字符交换。
 * 图4.14 就是分别把第一个字符a 和后面的b、c 等字符交换的情形。首先固定第一个字符（如图4.14 (a ）所示〉，求后面所有字符的排列。
 * 这个时候我们仍把后面的所有字符分成两部分：后面字符的第一个字符，以及这个字符之后的所有字符。然后把第一个字符逐一和它后面的字符交换
 */

public class PermutationString {

    public static void permutation(char[] chars) {
        if (chars == null || chars.length < 1) {
            return;
        }
        permutation(chars, 0);


    }

    public static void permutation(char[] chars, int start) {

        if (chars.length - 1 == start) {
            System.out.println(new String(chars));
        } else {
            char tem;
            for (int i = start; i < chars.length; i++) {
                tem = chars[start];
                chars[start] = chars[i];
                chars[i] = tem;
                permutation(chars, start + 1);
                //恢复前面的变化
                tem = chars[start];
                chars[start] = chars[i];
                chars[i] = tem;
            }
        }


    }

    public static void main(String[] args) {
        char[] c1 = {'a', 'b', 'c'};
        permutation(c1);
    }

}
