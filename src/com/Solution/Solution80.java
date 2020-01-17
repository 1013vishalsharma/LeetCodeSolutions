package com.Solution;

public class Solution80 {
	
	public int removeDuplicates(int[] nums) {
		if(nums.length == 0){
			return 0;
		}
		int len=0, k=2;
        for(int i=0; i<nums.length; i++){
        	if(i==0){
        		k--;
        		len++;
        		continue;
        	}
        	else{
        		if(nums[i] == nums[i-1] && k>0){
        			k--;
        			len++;
        			nums[len-1] = nums[i];
        		}
        		else if(nums[i] > nums[i-1]){
        			k=2;
        			len++;
        			nums[len-1] = nums[i];
        			k--;
        		}
        		else if(nums[i] == nums[i-1] && k<=0){
        			continue;
        		}
        	}
        }
        
        for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] +" ");
		}
        System.out.println();
        System.out.println(len);
        return len;
    }

	public static void main(String[] args) {
		Solution80 sol = new Solution80();
		//int[] nums = {0,0,1,1,1,1,2,3,3};
		int[] nums = {1,1,1,2,2,3};
		sol.removeDuplicates(nums);
	}

}
