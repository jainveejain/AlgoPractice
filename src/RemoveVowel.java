//can use capital also
public class RemoveVowel {
	
	public static String removeVowel(String s) {
		
	char arr[] =	s.toCharArray();
	String s1 = "";
	for(int i =0;i<=arr.length-1;i++) {
		if(arr[i]!='a' && arr[i]!= 'e'&& arr[i]!='i' && arr[i]!='o' && arr[i]!='u' ){
			s1 = s1 + arr[i];
		}
	}
		return s1;
	}
	
	public static void main(String[] args) {
		String s = "welcome to geeksforgeeks";
	String s1 =	 removeVowel(s);
	System.out.println(s1);
		
	}
}
