import java.util.Scanner;

public class AnagramCharacter {
	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		} else {
			char[] str1 = s1.toCharArray();   //then sorting
			for (int i = 0; i <= str1.length - 1; i++) {
				for (int j = i + 1; j <= str1.length - 1; j++) {
					if (str1[i] > str1[j]) {
						char temp = str1[i];
						str1[i] = str1[j];
						str1[j] = temp;
					}
				}
			}
			char[] str2 = s2.toCharArray();
			for (int i = 0; i <= str2.length - 1; i++) {
				for (int j = i + 1; j <= str2.length - 1; j++) {
					if (str2[i] > str2[j]) {
						char temp = str2[i];
						str2[i] = str2[j];
						str2[j] = temp;
					}
				}
			}
			for (int i = 0; i <= str1.length - 1; i++) {
				if (str1[i] != str2[i]) {
					return false;
				}
			}

		}

		return true;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		boolean b = isAnagram(s1, s2);
		System.out.println(b);
	}
}
