package com.song;

import java.util.Stack;

/**
 * 反着打印数组
 */

public class PrintListReverse {
    /**
     * 表的结构体
     */
    public static class Node {
        int value;
        Node next = null;

        public Node(int value) {
            this.value = value;
        }

        public Node() {

        }
    }
    /**
     * 头结点
     */
    public static Node head = null;

    public static Stack<Node> stack = new Stack<Node>();

    /**
     * 往链表中添加一个元素
     */
    public static void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }

    /**
     * 顺序打印一个链表
     */
    public static void printList() {
        if (head == null) {
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }

    /**
     * 把链表压如到栈中
     */
    public static void pushNodeToStack() {
        if (head == null) {
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            stack.push(currentNode);
            currentNode = currentNode.next;
        }
    }

    /**
     * 把链表从栈中弹出来
     */
    public static void printStack() {
        if (stack.isEmpty()) {
            return;
        }
        Node currentNode = null;
        while (!stack.isEmpty()) {
            currentNode = stack.pop();
            System.out.print(currentNode.value + " ");
        }
    }


    public static void main(String[] args) {
        add(1);
        add(3);
        add(4);
        add(5);
        add(7);
        printList();
        pushNodeToStack();
        printStack();
    }
}
