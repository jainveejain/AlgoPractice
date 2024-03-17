import java.util.Arrays;

public class NoRepeatCharInString {
	
	public static String NoRepeatCharInStringMethod(String s) {
		String s1 = "";
		char[] arr = s.toCharArray();
		 Arrays.sort(arr);
		for(int i = 0,j=1;j<=arr.length-1;j++) {
			if(arr[i]!=arr[j]) {
				i++;
				arr[i]=arr[j];
				
			}
		}
		 s1 = new String(arr);
		return s1;
		
	}
	
	public static void main(String args[]) {
		String s = "Propertyfry";
		String s1 = NoRepeatCharInStringMethod(s);
		System.out.println(s1);
		
	}

}
