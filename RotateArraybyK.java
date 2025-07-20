package TimePass;

public class RotateArraybyK {
	
	public static int [] temper(int[] nums, int k) {
		int temp [] = new int[k]; 
		for(int i=0; i<k; i++) {
			temp[i] = nums[i]; 
		}
		return temp; 
	}
	public static void rotateArrayByOne(int[] nums , int k) {
		k = k%nums.length; 
        int temp [] = temper(nums, k);
      
        for(int i=k; i<nums.length; i++) {
        	nums[i-k] = nums[i]; 
        }
        for(int j= nums.length - k; j < nums.length; j++) {
        	nums[j] = temp[j-(nums.length - k)]; 
        }
        for(int a : nums) {
        	System.out.print(a+" ");
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7}; 
		int k = 9; 
		rotateArrayByOne(arr, k);
	}

}
