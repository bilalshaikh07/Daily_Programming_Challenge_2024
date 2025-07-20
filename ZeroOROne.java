package TimePass;

import java.util.Arrays;

public class ZeroOROne {
	public static void swap(int l , int m, int[]arr ) {
		int temp = arr[l]; 
		arr[l] = arr[m]; 
		arr[m] = temp; 
	}
	
    public static void majorityElement(int[] nums) {
         int mid =0; 
         int low =0; 
         int high = nums.length-1; 
         
         while(mid<=high) {
        	 if(nums[mid] == 0) {
        		 swap(low, mid, nums); 
        		 low++; 
        		 mid++; 
        	 }else if(nums[mid] == 1) {
        		 mid++; 
        	 }else {
        		 swap(mid, high , nums);
        		 high--; 
        	 }
         }
         
         for(int a : nums) {
        	 System.out.print(a);
         }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []  nums = {1, 0, 2, 1, 0};
		majorityElement(nums); 
//		System.out.println(fq);
	}

}
