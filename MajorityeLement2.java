package TimePass;

import java.util.ArrayList;
import java.util.List;

public class MajorityeLement2 {
    public static List<Integer> majorityElementTwo(int[] nums) {
    	List<Integer> st = new ArrayList<Integer>(); 
    	boolean visited[] = new boolean[nums.length]; 
    	
    	for(int i=0; i<nums.length; i++) {
    		int cnt=0; 
    		int totalcnt = nums.length/3; 
    		
    		if(visited[i] == true) {
    			continue; 
    		}
    		
    		for(int j=0; j<nums.length; j++) {
    			if(nums[j] == nums[i]) {
    				cnt = cnt+1; 
    				visited[j] = true; 
    			}
    		}
    		if(cnt>totalcnt) {
    			st.add(nums[i]);
    		}
    	}
    	return st; 
    	
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1, 2, 1, 1, 3, 2, 2};
	  List<Integer>stt =	majorityElementTwo(arr);
	  System.out.println(stt);
	}

}
