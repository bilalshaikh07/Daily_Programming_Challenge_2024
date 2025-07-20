package TimePass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static  int longestConsecutive(int[] nums) {
    	 int n = nums.length;
         if (n == 0)
             return 0;

         int longest = 1;
         Set<Integer> set = new HashSet<>();

         // put all the array elements into set
         for (int i = 0; i < n; i++) {
             set.add(nums[i]);
         }
         System.out.println(set);
         // Find the longest sequence
         for (int it : set) {
             // if 'it' is a starting number
             if (!set.contains(it - 1)) {
                 // find consecutive numbers
                 int cnt = 1;
                 while (set.contains(it + cnt)) {
                     cnt = cnt + 1;
                 }
                 longest = Math.max(longest, cnt);
             }
         }
         return longest;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,1,1,4,7,3,-1,0,5,8,-1,6}; 
		int res = longestConsecutive(arr); 
		System.out.println(res);
	}

}
