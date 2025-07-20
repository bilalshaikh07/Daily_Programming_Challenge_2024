package TimePass;

public class majorityElement {
    public static int majorityElement(int[] nums) {

        int ans=0; 
        int fq=0; 
        for(int i=0; i<nums.length; i++) {
        	if(fq == 0) {
        		ans = nums[i];
        	}
        	if(ans==nums[i]) {
        		fq++;
        	}else {
        		fq--;
        	}
    }
        return ans; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {3, 3, 2, 3, 2};
		int fq = majorityElement(arr); 
		System.out.println(fq);
	}

}
