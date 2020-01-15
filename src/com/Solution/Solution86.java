package com.Solution;

public class Solution86 {

	public ListNode partition(ListNode head, int x) {
        ListNode l = null;
        ListNode h = null;
        while(head != null){
        	if(head.val < x){
        		l = insert(l, head.val);
        	}
        	else{
        		h = insert(h, head.val);
        	}
        	head = head.next;
        }
        ListNode ln = merge(l, h);
        display(ln);
        return ln;
    }
	
	private void display(ListNode ln){
		ListNode n = ln;
		while(n != null){
			System.out.print(n.val + " ");
			n = n.next;
		}
	}
	
	private ListNode insert(ListNode ln, int data){
		if(ln == null){
			ln = new ListNode(data);
		}
		else{
			ListNode n = ln;
			while(n.next != null){
				n = n.next;
			}
			n.next = new ListNode(data);
		}
		return ln;
	}
	
	private ListNode merge(ListNode l, ListNode h){
		ListNode ln = null;
		while(l!=null){
			ln = insert(ln, l.val);
			l = l.next;
		}
		while(h!=null){
			ln = insert(ln, h.val);
			h = h.next;
		}
		return ln;
	}

	public static void main(String[] args) {
		Solution86 sol = new Solution86();
		ListNode ln = new ListNode(1);
		ln.next = new ListNode(4);
		ln.next.next = new ListNode(3);
		ln.next.next.next = new ListNode(2);
		ln.next.next.next.next = new ListNode(5);
		ln.next.next.next.next.next = new ListNode(2);
		ln.next.next.next.next.next.next = new ListNode(3);
		
		sol.partition(ln, 3);
	}

}
