package com.Solution;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution103 {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> al = new ArrayList<List<Integer>>();
		if (root == null) {
			return al;
		}

		boolean front = true;
		Deque<TreeNode> dq = new LinkedList<>();
		dq.add(root);
		
		TreeNode n = null;
		int count = 0;

		while (!dq.isEmpty()) {
			LinkedList<Integer> ln = new LinkedList<>();
			int i = dq.size();
			count++;
			while (i != 0) {
				if (count % 2 != 0) {
					n = dq.pollFirst();
					ln.add(n.val);
					i--;

					if (n.left != null) {
						dq.addLast(n.left);
					}
					if (n.right != null) {
						dq.addLast(n.right);
					}
				
				} else {
					n = dq.pollLast();
					ln.add(n.val);
					i--;

					if (n.right != null) {
						dq.addFirst(n.right);
					}
					if (n.left != null) {
						dq.addFirst(n.left);
					}
				}
				
			}
			al.add(ln);
			front = !front;
		}
		return al;
	}

	public static void main(String[] args) {
		/*TreeNode tn = new TreeNode(3);
		tn.left = new TreeNode(9);
		tn.right = new TreeNode(20);
		tn.right.left = new TreeNode(15);
		tn.right.right = new TreeNode(7);*/
		
		TreeNode tn = new TreeNode(1);
		tn.left = new TreeNode(2);
		tn.right = new TreeNode(3);
		tn.left.left = new TreeNode(4);
		tn.right.right = new TreeNode(5);
		Solution103 sol = new Solution103();
		sol.zigzagLevelOrder(tn);
	}

}
