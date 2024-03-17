//input ---->max1 = 98, max2 = 76
//output---->174(98+76)

//1-->min,max
//second maximum num(largest)
//sorting 
//largestSum of two (can be n)

public class largestSum {
	public static int largestSumOfTwoNum(int arr[]) {
		
		// sort the array
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
	    }
		
		//print the array
		for (int num : arr) {
			System.out.println(num);
	    }
		
		int max1 =arr[arr.length-1];
		int max2 =arr[arr.length-2];
		int sum = max1+max2;
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 56, 34, 98, 22, 76, 67, 10 };
		System.out.println("largest sum of two integers is : " + largestSumOfTwoNum(arr));
	}
}
