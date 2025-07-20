package TimePass;

import java.util.ArrayList;

public class ArrayPrac {
	
    public static ArrayList<Integer> arraySortedOrNot(int[] arr, int n) {
    	boolean arr1 [] = new boolean[n]; 
    	ArrayList<Integer> st = new ArrayList<Integer>();
    	
    	for(int i=0; i<arr.length; i++) {
    		if(arr1[i] == true) {
    			continue; 
    		}
    		for(int j=0; j<arr.length; j++) {
    			if(arr[j] == arr[i]) {
    				arr1[j] = true; 
    			}
    		}
    		st.add(arr[i]); 
    	}
    	
    	return st; 
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,4,6,6,7,7,7,8};
		int n = arr.length; 
		ArrayList<Integer> res = arraySortedOrNot(arr,n);
	    System.out.println(res);
	}

}
