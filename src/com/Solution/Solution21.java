package com.Solution;

public class Solution21 {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
		ListNode l3 = null;
		if(l1 == null) {
			return l2;
		}
		else if(l2 == null) {
			return l1;
		}
		while(l1 != null && l2 != null) {
			if(l1.val <= l2.val) {
				l3 = insert(l3, l1.val);
				l1 = l1.next;
			}
			else {
				l3 = insert(l3, l2.val);
				l2 = l2.next;
			}
		}
		
		if(l1 == null && l2 !=null) {
			while(l2!=null) {
				l3 = insert(l3, l2.val);
				l2 = l2.next;
			}
		}
		if(l2 == null && l1 != null) {
			while(l1 != null) {
				l3 = insert(l3, l1.val);
				l1 = l1.next;
			}
		}
		return l3;
    }
	
	public ListNode insert(ListNode l3, int val) {
		if(l3 == null) {
			l3 = new ListNode(val);
		}
		else {
			ListNode n = l3;
			while(n.next != null) {
				n = n.next;
			}
			n.next = new ListNode(val);
		}
		return l3;
	}
	
	public void display(ListNode l3) {
		while(l3 != null) {
			System.out.println(l3.val);
			l3 = l3.next;
		}
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		Solution21 sol = new Solution21();
		ListNode l3 = sol.mergeTwoLists(l1, l2);
		sol.display(l3);
	}

}
