package com.Solution;

import java.util.HashMap;
import java.util.Map;

public class Solution105 {

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < inorder.length; i++) {
			map.put(inorder[i], i);
		}
		TreeNode tn =  buildTree(inorder, preorder, map, 0, preorder.length - 1);
		return tn;
	}

	static int preIndex = 0;

	public TreeNode buildTree(int[] inorder, int[] preorder, Map<Integer, Integer> map, int start, int end) {

		if (start > end) {
			return null;
		}

		int i = preorder[preIndex++];

		TreeNode tn = new TreeNode(i);

		int index = map.get(i);

		tn.left = buildTree(inorder, preorder, map, start, index - 1);
		tn.right = buildTree(inorder, preorder, map, index + 1, end);
		return tn;

	}

	public static void main(String[] args) {
		int preorder[] = { 3, 9, 20, 15, 7 };
		int inorder[] = { 9, 3, 15, 20, 7 };
		Solution105 sol = new Solution105();
		sol.buildTree(preorder, inorder);
	}

}
