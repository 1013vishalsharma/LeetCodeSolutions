package com.Solution;

public class Solution82 {
	
	public ListNode deleteDuplicates(ListNode head) {
        
		if(head == null){
			return head;
		}
		else{
			ListNode n = head;
			ListNode prev = n;
			ListNode i = null;
			
			n= n.next;
			
			while(n != null){
				if(n.val != prev.val){
					i = prev;
					prev = n;
					n = n.next;
				}
				else{
					while(n != null && prev != null && n.val == prev.val){
						n = n.next;
					}
					if(i == null){
						head = n;
						prev = n;
						if(n!=null)
						n = n.next;
					}
					else{
						i.next = n;
						prev = i;
					}
				}
			}
		}
		display(head);
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
		Solution82 sol = new Solution82();
		ListNode head = new ListNode(1);
		/*head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next = new ListNode(5);*/
		
		head.next = new ListNode(1);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(2);
		//head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);
		//head.next.next.next.next.next = new ListNode(3);
		
		
		sol.deleteDuplicates(head);
	}

}
