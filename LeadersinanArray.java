package TimePass;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersinanArray {
    public static ArrayList<Integer> leaders(int[] nums) {
    	ArrayList<Integer> st = new ArrayList<Integer>(); 
    	int max = nums[nums.length-1]; 
    	st.add(max); 
    	for(int i=nums.length-2; i>=0; i--) {
    		if(nums[i]>max ) {
    			max = nums[i];
    			st.add(nums[i]);
    		}
    	} 
    	Collections.reverse(st);
        return st; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-3, 4, 5, 1, -4, -5};
		ArrayList<Integer> dk = leaders(arr); 
		System.out.println(dk);

	}

}
