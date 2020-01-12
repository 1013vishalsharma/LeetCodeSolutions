package com.Solution;

import java.util.List;

public class Solution61 {

	public ListNode rotateRight(ListNode head, int k) {
        ListNode tail = head;
		ListNode prev = null;
		
		head = rotate(head, tail, prev, k);
		return head;
    }
	
	public ListNode rotate(ListNode head, ListNode tail, ListNode prev, int k){
		if(tail.next != null){
			prev = tail;
			tail = tail.next;
			k--;
			head = rotate(head, tail, prev, k);
			if(k <0){
				tail.next = head;
				prev.next = null;
				head = tail;
			}
			display(head);
			return head;
		}
		return headrr;
	}
	
	public void display(ListNode head){
		ListNode n = head;
		while(n != null){
			System.out.print(n.val + " ");
			n = n.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ListNode li = new ListNode(1);
		li.next = new ListNode(2);
		li.next.next = new ListNode(3);
		//li.next.next.next = new ListNode(4);
		//li.next.next.next.next = new ListNode(5);
		
		Solution61 sol = new Solution61();
		sol.rotateRight(li,  4);
	}

}
