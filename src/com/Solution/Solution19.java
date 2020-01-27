package com.Solution;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution19 {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null) {
			return null;
		} else {
			int x = 0;
			ListNode ln = head;
			int len = len(head);
			x = len - n;
			if (x == 0) {
				head = head.next;
			} else {
				while (x-1 != 0) {
					x--;
					ln = ln.next;
				}
				ln.next = ln.next.next;
			}

			//display(head);
		}
		return head;
	}

	public int len(ListNode head) {
		int count = 0;
		ListNode ln = head;
		while (ln != null) {
			count++;
			ln = ln.next;
		}
		return count;
	}


	public void display(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	public static void main(String[] args) {

		ListNode ln = new ListNode(1);
		ln.next = new ListNode(2);
		ln.next.next = new ListNode(3);
		ln.next.next.next = new ListNode(4);
		ln.next.next.next.next = new ListNode(5);

		Solution19 sol = new Solution19();
		sol.removeNthFromEnd(ln, 5);
	}

}
