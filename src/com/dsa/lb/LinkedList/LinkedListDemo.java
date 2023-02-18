package com.dsa.lb.LinkedList;

import com.dsa.practice.leetcode.easy.RemoveLLElements;

public class LinkedListDemo {
    ListNode head;

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }

        public String toString() {
            return "" + val;
        }
    }

    public void add(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            ListNode last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void addAtFirst(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public void addAtMid() {

    }

    public void printLL(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " --> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public int getSize(ListNode head) {
        ListNode curr = head;
        int size = 0;
        while (curr.next != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }

    public ListNode findMid(ListNode head) {
        int size = (getSize(head)/2)+1;
        int i=0;
        ListNode curr = head;
        ListNode start = null;
        while (curr != null){
            i++;
            if(size == i){
                start = curr;
            }
            curr = curr.next;
        }
        return start;
    }

    public void findMidSlowFast(ListNode head) {

    }


    public static void main(String[] args) {
        LinkedListDemo ll = new LinkedListDemo();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.printLL(ll.head);
        ll.findMid(ll.head);
        ll.printLL(ll.head);
        ll.addAtFirst(7);
        ll.printLL(ll.head);
    }
}
