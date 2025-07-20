package TimePass;

import java.util.ArrayList;

public class SpiralPattern {
    public static void spiralOrder(int[][] matrix) {
    	int n = matrix.length; 
    	int m = matrix[0].length; 
    	int left =0; 
    	int right = m-1; 
    	int top =0;
    	int bottom = n-1; 
    	ArrayList<Integer> st = new ArrayList<Integer>();
    	
    	while(top<=bottom && left<=right) {
//    	right
    	for(int i=left; i<=right; i++) {
    		st.add(matrix[top][i]); 
    	}
    	top++; 
    	
//   bottom
    	
    	for(int i=top; i<=bottom; i++) {
    		st.add(matrix[i][right]);
    	}
    	right--; 
    	
  // left 
    	if(top<=bottom) {
    	for(int i=right; i>=left; i--) {
    		st.add(matrix[bottom][i]); 
    	}
    	bottom--; 
    	}
   //top 
    	if(left<=right) {
    	for(int i=bottom; i>=top; i--) {
    		st.add(matrix[i][left]); 
    	}
        left++;
    	}
    	}
    	
    	System.out.println(st);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		spiralOrder(arr);
		
	}

}
