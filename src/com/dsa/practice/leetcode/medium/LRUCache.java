package com.dsa.practice.leetcode.medium;

import java.util.HashMap;

public class LRUCache {
	/**
	 * define a double LinkedList Node, with key, value, pointer to next node and
	 * previous node
	 * 
	 * @author Goutam
	 *
	 */
	class Node {
		int key;
		int value;
		Node next;
		Node prev;

		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	// using hashmap to get the Node in O(1) and define dummy head and tail to store
	// the most recent (tail) or the least recent node (head)
	private HashMap<Integer, Node> hash;
	private int capacity;
	private Node head;
	private Node tail;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		hash = new HashMap<>();
		head = null;
		tail = null;
	}

	public int get(int key) {
		Node node = hash.get(key);
		if (node == null) {
			return -1;
		}
		// if the node is not the lastest added one, doing the operation of relinking
		// nodes in the LinkedList
		if (node != tail) {
			// remove the head and assign a new head if the node to get is the least recent
			// one, else just doing the operation
			if (node == head) {
				head = head.next;
			} else {
				node.prev.next = node.next;
				node.next.prev = node.prev;
			}
			// set the new node to tail
			tail.next = node;
			node.prev = tail;
			node.next = null;
			tail = node;
		}
		return node.value;
	}

	public void put(int key, int value) {
		Node node = hash.get(key);
		if (node != null) {
			if (node == head) {
				head = head.next;
			} else {
				node.prev.next = node.next;
				node.next.prev = node.prev;
			}
			tail.next = node;
			node.prev = tail;
			node.next = null;
			tail = node;
		} else {
			// otherwise, initialize a new node with key, value pair
			Node newNode = new Node(key, value);
			// if the available capacity of the list is 0, remove its head, assign new head
			// and add 1 for capacity
			if (capacity == 0) {
				Node temp = head;
				head = head.next;
				hash.remove(temp.key);
				capacity++;
			}
			// if the list is empty, set the new node to head, else just add the new node to
			// the tail and set it as new tail
			if (head == null && tail == null) {
				head = newNode;
			} else {
				tail.next = newNode;
				newNode.prev = tail;
				newNode.next = null;
			}
			tail = newNode;
			// put the key, newNode pair to hashmap and decrease 1 for capacity
			hash.put(key, newNode);
			capacity--;
		}
	}

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		cache.put(1, 1);
		cache.put(2, 2);
		System.out.println(cache.hash);
		System.out.println(cache.get(1));
		System.out.println(cache.hash);
		cache.put(3, 3);
		System.out.println(cache.get(2));
		System.out.println(cache.hash);
		cache.put(4, 4);
		System.out.println(cache.hash);
		System.out.println(cache.get(1));
		System.out.println(cache.hash);
		System.out.println(cache.get(3));
		System.out.println(cache.hash);
		System.out.println(cache.get(4));
		System.out.println(cache.hash);
		
		/*
		 * ["LRUCache","put","put","get","put","get","put","get","get","get"]
		 * [[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]
		 */
	}

}
