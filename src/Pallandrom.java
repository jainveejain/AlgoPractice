import java.util.Scanner;

public class Pallandrom {
	
	public static boolean checkPallandrom(String s) {
		for(int i=0,j=s.length();i<=s.length()/2 && j<=s.length()/2;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean b = checkPallandrom(s);
		System.out.println(b);
		
	}
	}


