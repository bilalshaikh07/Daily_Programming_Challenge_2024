package TimePass;
import java.util.HashMap;

public class SumSubArray {

	public static int solution(int [] arr, int k) {
        int n = arr.length; // size of the array.
        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += arr[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            int rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = {9,4,20,3,10,5};
	int k = 33; 
	int ans = solution(arr, k); 
	System.out.println(ans);

	}

}
