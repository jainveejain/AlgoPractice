//input ----> arr[]
// output ---> 16(7+9)
//input ----->
public class MaxSubArraySum {
	public static void main(String args[]) {
		int arr[]= {1,-2,3,-4,7,9,-9};
		int currentSum = arr[0];
		int maxSum = arr[0];
		
		for(int i = 1; i<=arr.length-1;i++) {
			
			if(arr[i]>currentSum+arr[i]) {
				currentSum = arr[i];
			}else {
				currentSum = currentSum+arr[i];
			}
			if(maxSum<currentSum) {
				maxSum = currentSum;
			}
			//currentSum = Math.max(arr[i], currentSum+arr[i]);
			//maxSum = Math.max(maxSum, currentSum);
		}
		
		System.out.println(maxSum);
	}

}
