package com.dsa.practice.leetcode.medium;

public class ReverseLinkedListII {
	ListNode head;

	public class ListNode {
		int val;
		ListNode next;

		public ListNode(int x) {
			val = x;
		}

		public String toString() {
			return "" + val;
		}
	}

	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode curr = head;
		int i = 0;
		ListNode next = null;
		ListNode prev = null;
		while (curr != null) {
			i++;
			if (i <= n && i >= m) {
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			} else {
				
			}
			curr = curr.next;
		}
		return head;
	}

	public void add(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = null;

		if (head == null) {
			head = newNode;
		} else { // add at last
			ListNode last = head;
			while (last.next != null) { // traverse and find last.next is null
				last = last.next;
			}
			last.next = newNode;
		}
	}

	public void printLL() {
		ListNode cuNode = head;
		while (cuNode != null) {
			System.out.print(cuNode + " -> ");
			cuNode = cuNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ReverseLinkedListII ll = new ReverseLinkedListII();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.printLL();
		ll.reverseBetween(ll.head, 2, 4);
		ll.printLL();
	}

}
