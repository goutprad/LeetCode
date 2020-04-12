package com.dsa.practice.leetcode.medium;

public class SwapNodesInPairs {
	ListNode head;

	static class ListNode {
		int val;
		ListNode next;

		public ListNode(int x) {
			val = x;
			next = null;
		}

		public String toStiString() {
			return "" + val;
		}
	}

	public static void printLL(ListNode head) {
		ListNode curr = head;
		while (curr != null) {
			System.out.print(curr.val + " --> ");
			curr = curr.next;
		}
		System.out.println();
	}

	public ListNode swapPairs(ListNode head) {
		ListNode prev = null;
		ListNode curNode = head;
		while(curNode!=null && curNode.next!=null) {
			prev = curNode.next;
			prev.next = curNode;
			curNode = curNode.next.next;
		}
		return prev;
	}

	public static void main(String[] args) {
		SwapNodesInPairs ll = new SwapNodesInPairs();
		ll.head = new ListNode(1);
		ll.head.next = new ListNode(2);
		//ll.head.next.next = new ListNode(3);
		//ll.head.next.next.next = new ListNode(4);
		printLL(ll.head);
		ListNode head = ll.swapPairs(ll.head);
		printLL(head);
	}

}
