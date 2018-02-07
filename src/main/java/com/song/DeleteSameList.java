package com.song;

public class DeleteSameList {

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

//    public static Node deleteSameList(Node node) {
//        if (node == null || node.next == null) {
//            return node;
//        }
//        Node root=new Node();
//        root.next=node;
//        Node pre=root;
//        Node current=node;
//        while (current!=null&&current.next!=null){
//            if(current.value==current.next.value){
//                while (current)
//            }
//        }
//    }
}
