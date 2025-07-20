package TimePass;

public class MaximumSubarraySum {
    public static  int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE; 
        
        for(int i=0; i<nums.length; i++ ) {
        	int sum =0; 
        	
        	for(int j=i; j<nums.length; j++) {
        		sum+=nums[i];
        		maxi = Math.max(sum, maxi); 
        	}
        	
        	
        }
        
        return maxi; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2, -3, -7, -2, -10, -4};
		int re = maxSubArray(arr);
		System.out.println(re);
	}

}
