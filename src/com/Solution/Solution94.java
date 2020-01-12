package com.Solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode(int x) { val = x; }
}

public class Solution94 {
	
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> li = inorderTraversal(root, new ArrayList<Integer>());
        for (Iterator iterator = li.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer);
		}
        return li;
    }
	
	/*public List<Integer> inorderTraversal(TreeNode root, List<Integer> li){
		if(root != null){
			inorderTraversal(root.left, li);
			li.add(root.val);
			inorderTraversal(root.right,li);
		}
		return li;
	}*/

	public static void main(String[] args) {
		TreeNode tn = new TreeNode(1);
		tn.left = null;
		tn.right = new TreeNode(2);
		tn.right.left = new TreeNode(3);
		Solution94 sol = new Solution94();
		sol.inorderTraversal(tn);
	}

}
