package com.Solution;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution24 {

	public ListNode swapPairs(ListNode head) {
		if (head == null) {
			return null;
		} else {
			ListNode h = head;
			h = swap(h, 2);
			return h;
		}
	}

	public void display(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

	public ListNode swap(ListNode head, int k) {
		ListNode prev = head;
		ListNode curr = head;
		ListNode next = curr.next;
		int i = k;

		while (curr.next != null && i > 1) {
			curr.next = next.next;
			next.next = prev;
			prev = next;
			next = curr.next;
			i--;
		}
		if (curr.next != null) {
			curr.next = swap(curr.next, k);
		}
		return prev;
	}

	public static void main(String[] args) {
		ListNode ln = new ListNode(1);
		ln.next = new ListNode(2);
		ln.next.next = new ListNode(3);
		ln.next.next.next = new ListNode(4);

		Solution24 sol = new Solution24();
		sol.swapPairs(ln);
	}

}
