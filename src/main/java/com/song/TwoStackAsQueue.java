package com.song;

import java.util.Stack;

/**
 * 用两个栈模拟的队列
 * 用两个核实现一个队列。队列的声明如下，诸实现它的两个函数appendTail和deleteHead，
 * 分别完成在队列尾部插入结点和在队列头部删除结点的功能。
 */

public class TwoStackAsQueue {

    public static class Node {
        int value;

        public Node(int value) {
            this.value = value;
        }

        public Node() {

        }
    }

    public static Stack<Node> stack1 = new Stack<Node>();
    public static Stack<Node> stack2 = new Stack<Node>();

    /**
     * 新来的数据永远压如第一个栈
     *
     * @param value
     */
    public static void appendTail(int value) {
        stack1.push(new Node(value));
    }

    /**
     * 如果第二个栈是空的，就把第一个栈的所以元素弹出，压如第二个栈，如果第二个栈不是空的，直接弹
     */
    public static void deleteHead() {

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return;
        }
        Node currentNode = stack2.pop();
        System.out.print(currentNode.value + " ");

    }

    public static void main(String[] args) {
        appendTail(1);
        appendTail(2);
        appendTail(3);
        appendTail(4);
        appendTail(5);
        appendTail(6);
        appendTail(7);
        appendTail(8);
        deleteHead();
        deleteHead();
        deleteHead();
        deleteHead();
    }


}
