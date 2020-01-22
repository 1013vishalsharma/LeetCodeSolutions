package com.Solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution102 {

	public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> qu = new LinkedList<>();

		List<List<Integer>> al = new ArrayList<List<Integer>>();
		if(root == null){
			return al;
		}
		qu.add(root);
		int i = 1;

		
		while (!qu.isEmpty()) {
			List<Integer> li = new ArrayList<>();
			i = qu.size();
			while (i != 0) {
				TreeNode n = qu.poll();
				li.add(n.val);

				if (n.left != null) {
					qu.add(n.left);
				}
				if (n.right != null) {
					qu.add(n.right);
				}
				i--;
			}
			al.add(li);
		}
		return al;
	}

	public static void main(String[] args) {
		Solution102 sol = new Solution102();
		TreeNode tn = new TreeNode(3);
		tn.left = new TreeNode(9);
		tn.right = new TreeNode(20);
		tn.right.left = new TreeNode(15);
		tn.right.right = new TreeNode(7);
		sol.levelOrder(tn);
	}

}
