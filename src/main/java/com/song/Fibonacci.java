package com.song;

/**
 * 写一个函数，输入n，求斐波那契（Fibonacci) 数列的第n项
 *
 * @param n Fibonacci数的项数
 * @return 第n项的结果
 */

public class Fibonacci {


    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
    }


}
