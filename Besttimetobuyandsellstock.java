package TimePass;

public class Besttimetobuyandsellstock {
    public static  int stockBuySell(int[] arr, int n) {
        int ans = 0;
        int temp =0; 
        for(int i=0; i<n; i++) {
        	for(int j=i+1; j<n; j++) {
        		if(arr[j]>arr[i]) {
        			temp = arr[j]-arr[i];		
        		}
            	if(temp>ans) {
            		ans = temp;
            	}
        	}

        }
        return ans ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {10, 7, 5, 8, 11, 9};
		int n = arr.length; 
		int result = stockBuySell(arr, n);
		System.out.println(result);
	}

}
