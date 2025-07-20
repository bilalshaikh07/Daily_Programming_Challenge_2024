package TimePass;

import java.util.ArrayList;

public class RearrangeArrayElementsBySign2 {
	public static int[] rearrangeArray(int[] nums) {
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		int n = nums.length; 
		
		for(int i=0; i<n; i++) {
			if(nums[i]>0) {
				pos.add(nums[i]); 
			}
			else {
				neg.add(nums[i]); 
			}
		}
		if(pos.size()>neg.size()) {
			for(int i=0; i<neg.size(); i++) {
				nums[2*i] = pos.get(i); 
				nums[2*i+1] = neg.get(i); 
			}
			int indx = neg.size()*2; 
			for(int i=neg.size(); i<pos.size(); i++) {
				nums[indx] = pos.get(i);
				indx++; 
			}
		}
		else {
			for(int i=0; i<pos.size(); i++) {
				nums[2*i] = pos.get(i); 
				nums[2*i+1] = neg.get(i); 
			}
			int indx = pos.size()*2; 
			for(int i=pos.size(); i<neg.size(); i++) {
				nums[indx] = neg.get(i);
				indx++; 
			}
		}
		return nums; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 4, 5,2,5, -1, -3, -4}; 
		int result [] = rearrangeArray(arr); 
		for(int a : result) {
			System.out.print(a+" ");
	}

}}
