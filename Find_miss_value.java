package TimePass;

import java.util.Arrays;

public class Find_miss_value {
//	Input: nums = [0, 2, 3, 1, 4]
//	Output: 5
	
    public static int missingNumber(int[] nums) {
    	int miss = 0; 
    	Arrays.sort(nums);
    	for(int i=0; i<nums.length; i++) {
    		if(nums[i] == miss) {
    			miss++; 
    		}else {
    			return miss; 
    		}
    	}
    	return miss; 
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {0, 2, 3, 1, 4};
		int re = missingNumber(arr);
		System.out.println(re);

	}

}
