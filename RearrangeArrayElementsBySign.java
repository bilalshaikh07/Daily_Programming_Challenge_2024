package TimePass;

public class RearrangeArrayElementsBySign {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length; 
        int ans[] = new int[n]; 
        int pos =0, neg = 1; 
        
        for(int i =0; i<n; i++) {
        	if(nums[i] <0) {
        		ans[neg] = nums[i];
        		neg+=2; 
        	}else {
        		ans[pos] = nums[i]; 
        		pos+=2; 
        	}
        }
        
        return ans; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 4, 5, -1, -3, -4}; 
		int result [] = rearrangeArray(arr); 
		for(int a : result) {
			System.out.print(a+" ");
		}
	}

}
