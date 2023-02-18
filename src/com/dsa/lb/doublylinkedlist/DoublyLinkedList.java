package com.dsa.lb.doublylinkedlist;

public class DoublyLinkedList {
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public void display(Node head){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data+"--->");
            curr = curr.next;

        }
        System.out.println("Null");
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = null;
        Node curr = head;

        if(head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
    }
}
