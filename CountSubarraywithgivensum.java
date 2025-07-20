package TimePass;

public class CountSubarraywithgivensum {

    public static int subarraySum(int[] nums, int k) {
        int cnt =0; 
        for(int i=0; i<nums.length; i++) {
        	int sm =0; 
        	if(nums[i]==k) {
    			cnt++;
    		}
        	int ssm =0;
        	for(int j=i+1; j<nums.length; j++) {
        			ssm = nums[j]+ nums[i];
        			System.out.println(ssm);
        			sm+=ssm; 
        			if(sm == k) {
        				cnt++; 
        			}
        		
        	}
        }
        
        return cnt ; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,-1,0};
		int k = 0; 
		int re = subarraySum(arr, k);
		System.out.println(re);
	}

}
