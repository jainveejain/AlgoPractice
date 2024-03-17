
//Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//Output: "leetcode"
//Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
//Example 2:
//
//Input: s = "abc", indices = [0,1,2]
//Output: "abc"
//Explanation: After shuffling, each character remains in its position.

public class ShuffleString {

	public static String restoreString(String s, int[] indices) {
		char charArray[] = s.toCharArray();
		for (int i = 0; i <= indices.length - 1; i++) {
			for (int j = i + 1; j <= indices.length - 1; j++) {
				if (indices[i] > indices[j]) {
					int temp1 = indices[i];
					indices[i] = indices[j];
					indices[j] = temp1;

					char temp2 = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp2;
				}
			}
		}

		String s1 = new String(charArray);
		return s1;
	}

	public static void main(String[] args) {
		String s = "codeleet";
		int indices[] = { 4, 5, 6, 7, 0, 2, 1, 3 };
		String s1 = restoreString(s, indices);
		System.out.println(s1);
	}
}
