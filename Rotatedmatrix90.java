package TimePass;

public class Rotatedmatrix90 {
    public static void rotateMatrix(int[][] matrix) { 
//        int arr[][] = new int[n][m]; 
//        
//        for(int i=0; i<n; i++) {
//        	for(int j=0; j<m; j++) {
//        		arr[j][n-1-i] = matrix[i][j]; 
//        	}
//        }
//        
//        for(int i=0; i<n; i++) {
//        	for(int j=0; j<m; j++) {
//        		System.out.print(arr[i][j]);
//        	}
//        	System.out.println();
//        }
    	 int n = matrix.length;

         // Step 1: Transpose the matrix (swap matrix[i][j] with matrix[j][i])
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < i; j++) {
                 int temp = matrix[i][j];
                 matrix[i][j] = matrix[j][i];
                 matrix[j][i] = temp;
             }
         }

         // Step 2: Reverse each row
         for (int i = 0; i < n; i++) {
             reverseRow(matrix[i]);
         }
         
     }

     // Helper function to reverse a row
     public static void reverseRow(int[] row) {
         int left = 0, right = row.length - 1;
         while (left < right) {
             int temp = row[left];
             row[left] = row[right];
             row[right] = temp;
             left++;
             right--;
         }
    }
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{5, 4, 2, 0}, {6, 5, 0, 1}, {7, 0, 3, 1}, {0, 5, 1, 2}};
		rotateMatrix(arr);
	}

}
