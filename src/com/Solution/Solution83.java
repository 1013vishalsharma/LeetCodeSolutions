package com.Solution;

public class Solution83 {
	
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null){
			return null;
		}
        ListNode n = head, prev = n;
        n = n.next; 
        while(n != null){
        	if(n.val == prev.val){
        		prev.next = n.next;
        		n = n.next;
        	}
        	else{
        		prev = prev.next;
        		n = n.next;
        	}
        }
		return head;
    }
	
	public void display(ListNode head){
		ListNode n = head;
		while(n != null){
			System.out.print(n.val + " ");
			n = n.next;
		}
	}

	public static void main(String[] args) {
		Solution83 sol = new Solution83();
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		//head.next.next.next = new ListNode(3);
		//head.next.next.next.next = new ListNode(3);
		
		sol.display(head);
		sol.deleteDuplicates(head);
		System.out.println();
		sol.display(head);
	}

}
