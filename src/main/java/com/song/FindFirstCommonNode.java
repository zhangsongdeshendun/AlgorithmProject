package com.song;

/**
 * 题目：输入两个链表，找出它们的第一个公共结点。
 * 第三种：先行法
 * 　　在图5.3 的两个链表中，我们可以先遍历一次得到它们的长度分别为5 和4， 也就是较长的链表与较短的链表相比多一个结点。第二次先在长的链表上走1 步，到达结点2。
 * 接下来分别从结点2 和结点4 出发同时遍历两个结点， 直到找到它们第一个相同的结点6，这就是我们想要的结果。
 * 　　第三种思路和第二种思路相比，时间复杂度都是O(m＋啡， 但我们不再需要辅助的拢，因此提高了空间效率。
 */


public class FindFirstCommonNode {

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
    public static void printList(Node node) {
        if (node == null) {
            return;
        }
        Node currentNode = node;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }

    /**
     * 返回一个一个链表的长度
     */
    public static int getListLength(Node node) {

        int length = 0;
        Node tem = node;
        if (tem == null) {
            return length;
        }
        while (tem != null) {
            tem = tem.next;
            length++;
        }

        return length;

    }

    public static Node findFirstCommonNode(Node head1, Node head2) {
        int head1Length = getListLength(head1);
        int head2Length = getListLength(head2);
        Node lengthNode = head1;
        Node shortNode = head2;
        int diff = head1Length - head2Length;
        if (diff < 0) {
            lengthNode = head2;
            shortNode = head1;
            diff = head2Length - head1Length;

        }
        for (int i = 0; i < diff; i++) {
            lengthNode = lengthNode.next;
        }
        while (shortNode != null && lengthNode != null && shortNode != lengthNode) {
            shortNode = shortNode.next;
            lengthNode = lengthNode.next;

        }

        return shortNode;


    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        printList(head);
    }

}
