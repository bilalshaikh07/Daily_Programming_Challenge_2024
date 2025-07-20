package TimePass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int cnt =0;
        boolean found = Arrays.stream(nums).anyMatch(k -> k == 0);
        if(found) {
            for(int i=0; i<nums.length; i++) {
            	int newcnt =0; 
            	for(int j=i; j<nums.length; j++) {
            		
            		
            			if(nums[j] == nums[i] && nums[j]!=0) {
            				newcnt++; 
            			}else {
            				break;
            			}
            	}
            	if(newcnt>cnt) {
    				cnt = newcnt; 
    			}
            }
        }else {
        	cnt = nums.length; 
        }

        return cnt; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}; 
		int cn = findMaxConsecutiveOnes(arr); 
		System.out.println(cn);
	}

}
