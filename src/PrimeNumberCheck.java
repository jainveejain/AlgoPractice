import java.util.Scanner;

public class PrimeNumberCheck {

	public static boolean isPrime(int n) {
		boolean flag = true;
		
		if(n==0 || n==1 || n==2) {
			return false;
		}
		else {
			for(int i = 2;i<=n-1;i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		
		return true;
		}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean  b = isPrime(n);
		System.out.println(b);
		
	}
}
