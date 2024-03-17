import java.util.Arrays;

public class RemoveDups {
	public static int[] removeDuplicate(int arr[]) {
		for(int i=0,j=1;j<=arr.length-1;j++) {
			if(arr[i]!= arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return arr;
	}
	
	public static void main(String args[]) {
		int arr [] = {2,5,6,6,7,8,8,9,11,11};
		 int arr1[] = removeDuplicate(arr);
		System.out.println(Arrays.toString(arr1));
	}

}
