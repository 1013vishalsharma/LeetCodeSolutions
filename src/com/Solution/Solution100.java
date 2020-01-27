package com.Solution;

import java.util.Stack;

class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }

public class Solution100 {
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
        String p1 = dfs(p);
        String q1 = dfs(q);
        System.out.println(p1);
        System.out.println(q1);
        
        if(p1.equals(q1)) {
        	return true;
        }
		return false;
    }
	
	public String dfs(TreeNode t) {
		String dfs = new String();
		Stack<TreeNode> stack = new Stack<>();
		
		if(t == null) {
			return dfs;
		}
		else {
			stack.push(t);
			
			while(!stack.isEmpty()) {
				TreeNode tn = stack.pop();
				if(tn == null) {
					dfs = dfs + null + " ";
					continue;
				}
				dfs = dfs + tn.val + " ";
				
				if(tn.left != null) {
					stack.push(tn.left);
				}
				if(tn.right != null) {
					if(tn.left == null) {
						stack.push(null);
					}
					stack.push(tn.right);
				}
			}
			return dfs;
		}
	}

	public static void main(String[] args) {

		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(1);
		
		TreeNode q = new TreeNode(1);
		q.left = new TreeNode(1);
		q.right = new TreeNode(2);
		
		Solution100 sol = new Solution100();
		System.out.println(sol.isSameTree(p, q));
	}

}
