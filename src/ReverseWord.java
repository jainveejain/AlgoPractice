import java.util.Scanner;

public class ReverseWord {

//	public static String reverseString(String s) {
//		String rev="";
//	char arr[] = s.toCharArray();
//		for(int i = arr.length-1;i>=0;i--) {
//			   rev = rev + arr[i];
//		}
//		return rev;
//		
//	}

	public static String reverseString(String s) {
		String s1 = "";
		for (int i = s.length()-1; i >= 0; i--) {
			 s1 = s1+ s.charAt(i);
			 
		}

		return s1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = reverseString(s);
		
		System.out.println(s1);
	}

}
