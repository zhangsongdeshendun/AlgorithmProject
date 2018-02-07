package com.song;

/**
 * 反转链表
 */
public class ReverseList {

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
     * 反转链表
     *
     * @return
     */
    public static Node reverseList() {
        if (head == null || head.next == null) {
            return head;
        }
        Node current = head;
        Node next = null;
        Node reverseNode = null;

        while (current != null) {
            next = current.next;

            current.next = reverseNode;
            reverseNode = current;

            current = next;
        }
        return reverseNode;
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        printList(head);
        Node reverseHead = reverseList();
        printList(reverseHead);

    }
}
