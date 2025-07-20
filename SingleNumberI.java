package TimePass;

import java.util.ArrayList;
import java.util.HashSet;

public class SingleNumberI {
    public static int singleNumber(int[] nums) {
        //your code goes here
    	boolean [] st = new boolean[nums.length]; 
    	
    	for(int i=0; i<nums.length; i++) {
    		int cn=1; 
    		if(st[i]==true) {
    			continue; 
    		}
    		for(int j=0; j<nums.length; j++) {
    			if(nums[i] == nums[j]) {
    				st[j] = true; 
    				cn+=1; 
    			}
    		}
    		if(cn < 3) {
    			return nums[i]; 
    		}
    		
    	}
    	return -1; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,1,2,1,2}; 
		int re = singleNumber(arr); 
		System.out.println(re);
	}

}
