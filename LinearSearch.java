package TimePass;

public class LinearSearch {
    public static int linearSearch(int nums[], int target) {
		//Your code goes here
    	int indx = -1; 
    	for (int i=0; i<nums.length; i++) {
    		if(nums[i] == target) {
    		    return indx = i; 
    		}
    	}
    	return indx; 
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: nums = [2, 3, 4, 5, 3], target = 3
//		Output: 1
		int arr[] = { 2, 3, 4, 5, 3}; 
		int tar = 6; 
		int result  = linearSearch(arr, tar);
		System.out.println(result);
	}

}
