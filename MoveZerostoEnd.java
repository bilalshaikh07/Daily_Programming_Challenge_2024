package TimePass;

import java.util.ArrayList;

public class MoveZerostoEnd {
	public static ArrayList<Integer>calzero(int [] nums) {
		ArrayList<Integer> st = new ArrayList<>(); 
		for(int a : nums) {
			if(a == 0) {
				st.add(a);
			}
		}
		return st;
	}
	
    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> temp = calzero(nums);
        for(int i=0; i<nums.length; i++) {
        	for (int k =0; k<nums.length; k++) {
               	int j=k; 
            	if(nums[k]==0) {
            		while(j<nums.length-1) {
            			nums[j] = nums[j+1]; 
            			j++; 
            		}
            	}
        	}
 
        }
        int temlen = temp.size();
        int k=0; 
        for(int i = nums.length - temlen; i<nums.length; i++) {
        	nums[i] = temp.get(k); 
        	k++; 
        }
//        
       for(int a : nums) {
    	   System.out.println(a);
       }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: nums = [0, 1, 4, 0, 5, 2]
		//Output: [1, 4, 5, 2, 0, 0]
		int nums [] = {0, 1, 4, 0, 5, 2};
		
		moveZeroes(nums);
	}

}
