import java.util.Scanner;

public class PrimeList {

	public static void printPrimeNumbers(int n) {
		if (n > 3) {
			for (int i = 3; i <= n; i++) {
				int j = 2;
				for (; j < i; j++) {
					if (i % j == 0) {
						break;
					}
				}
				if (j == i) {
					System.out.println(i);
				}
			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPrimeNumbers(n);

	}
}
