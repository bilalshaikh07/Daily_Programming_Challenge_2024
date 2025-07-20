package TimePass;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RotateArraybyOne {
	
    public static void rotateArrayByOne(int[] nums) {
        int temp = nums[0];
      
        for(int i=0; i<nums.length; i++) {
        	if(i != nums.length-1) {
        		nums[i]= nums[i+1];
        	}else {
        		break; 
        	}
        }
        nums[nums.length-1] = temp; 
        for(int a : nums) {
        	System.out.print(a+" ");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1, 2, 3, 4, 5};
		rotateArrayByOne(arr);
	}

}
