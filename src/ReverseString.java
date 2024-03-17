import java.util.Scanner;
//input ----> s = my name is jainvy
//output----->jainvy is name my


public class ReverseString {
	
	public static String reverseString(String s) {

		String[] arr = s.split(" ");

		//String[] arr1 = new String[arr.length - 1];
		
		String result = "";
		for (int i = arr.length - 1; i >= 0 ; i--) {
			 result  = result+arr[i]+" ";
		}
		
		 return result;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result1 = reverseString(s);
		System.out.println(result1);

	}
}
