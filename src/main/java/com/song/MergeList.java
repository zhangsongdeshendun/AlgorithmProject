package com.song;

/**
 * 合并两个排序链表
 */
public class MergeList {

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
    public static Node head1 = null;
    public static Node head2 = null;


    /**
     * 往链表中添加一个元素
     */
    public static void add(Node head, int value) {
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
     * 合并两个有序链表
     *
     * @return
     */
    public static Node MergeList(Node head1, Node head2) {
        Node mergeHead = null;
        Node next;
        if (head1 == null && head2 == null) {
            return null;
        }
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        if (head1.value <= head2.value) {
            next = head1;
            mergeHead = next;
            head1 = head1.next;
        } else {
            next = head2;
            mergeHead = next;
            head2 = head2.next;
        }
        while (head1 != null && head2 != null) {
            if (head1.value <= head2.value) {
                next.next = head1;
                next = next.next;
                head1 = head1.next;
            } else {
                next.next = head2;
                next = next.next;
                head2 = head2.next;
            }
        }
        if (head1 == null) {
            next.next = head2;
        }
        if (head2 == null) {
            next.next = head1;
        }


        return mergeHead;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node head2 = new Node(2);
        add(head1, 3);
        add(head1, 5);
        add(head1, 7);
        add(head2, 4);
        add(head2, 6);
        add(head2, 8);
        Node mergeNode = MergeList(head1, head2);
        printList(mergeNode);


    }
}
