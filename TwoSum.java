package TimePass;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int aa [] = new int[2]; 
        for(int i=0; i<nums.length; i++) {
        	for(int j=0; j<nums.length; j++) {
        		if(nums[i]+nums[j] == target) {
        			aa[0] = j; 
        			aa[1] = i; 
        			break; 
        		}
        	}
        }
        return aa; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {1, 3, 5, -7, 6, -3}; 
			int tr = 0; 
			int arr1[] = twoSum(arr, tr);
		    for(int a : arr1) {
		    	System.out.println(a);
		    }
	}

}
