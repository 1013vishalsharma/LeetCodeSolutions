package com.Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Solution107 {
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Map<Integer, List<Integer>> map = new TreeMap<>(Collections.reverseOrder());
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        preOrder(map, root, 1);
        
        Iterator<Entry<Integer, List<Integer>>> itr = map.entrySet().iterator();
        
        while(itr.hasNext()){
        	al.add(itr.next().getValue());
        }
        return al;
    }
	
	public void preOrder(Map<Integer, List<Integer>> map, TreeNode root, int level){
		
		if(root == null){
			return;
		}
		
		if(map.containsKey(level)){
			map.get(level).add(root.val);
		}
		else{
			List<Integer> li = new ArrayList<>();
			li.add(root.val);
			map.put(level, li);
		}
		
		preOrder(map, root.left, level+1);
		preOrder(map, root.right, level+1);
	}

	public static void main(String[] args) {
		TreeNode tn = new TreeNode(3);
		tn.left = new TreeNode(9);
		tn.right = new TreeNode(20);
		tn.right.left = new TreeNode(15);
		tn.right.right = new TreeNode(7);
		
		Solution107 sol = new Solution107();
		sol.levelOrderBottom(tn);
	}

}
