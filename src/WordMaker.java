//input----> Hello Elephant look left orange
//output---> hello
public class WordMaker {
	public static String paraToString(String s) {
		
		String [] str = s.split(" ");
		String str3 ="";
		for(int i = 0;i<=str.length-1;i++) {
			  String str1 = str[i];
			 String str2 =  str1.substring(0,1);
			  str3 = str3 + str2;
		}
		return str3;
	}
	public static void main (String args[]) {
		String str = "Hello Elephant look left orange";
		 String s = paraToString(str);
		 System.out.println(s);
	}

}
