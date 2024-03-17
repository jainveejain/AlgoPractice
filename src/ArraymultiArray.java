import java.util.Arrays;

//input----> int arr[] = {2,6,8,2,7};
//output----> int arr1[] = {12,48,16,14,7};



public class ArraymultiArray {
	public static int[] arrayMulipliedToNext(int arr[]) {
		for(int i=0,j=i+1;i<=arr.length-2 && j<=arr.length-1;i++,j++) {
			
				
			
			arr[i] = arr[i]*arr[j];
			
			System.out.println(arr[i]);
		}
		return arr;
	}
	
	public static void main(String args[]) {
		int arr[] = { 2,6,8,2,7};
		int newArray[] = arrayMulipliedToNext(arr);
		String s =Arrays.toString(newArray);
		System.out.println(s);
	}

}
