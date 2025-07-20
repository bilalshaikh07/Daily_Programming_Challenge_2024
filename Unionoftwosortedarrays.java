package TimePass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Unionoftwosortedarrays {
    public static  int[]unionArrayK(int[]nums1,  int[] nums2) {
    	
   
    	Set<Integer> st = new HashSet<Integer>(); 
    	for(int i=0; i<nums1.length; i++) {
    		st.add(nums1[i]); 
    	}
    	
    	for(int j=0; j<nums2.length; j++) {
    		st.add(nums2[j]); 
    	}
    	
    	int sz = st.size(); 
    	int temp[] = new int[sz]; 
    	int i=0; 
    	for(int a : st) {
    		temp[i] = a;
    		i++; 
    	}
        return temp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num1 =  {1, 2, 3, 4, 5};
		 int [] nums2 = {1, 2, 7};
		 int [] arr = unionArrayK(num1, nums2); 
		 for(int a : arr) {
			 System.out.println(a);
		 }
	}

}
