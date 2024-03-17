import java.util.Arrays;
// 1 largestNum can be formed
//2 smallest Num can be formed

// 3 given number is 213 (input)
//largest number can be formed is ----->321
//smallest number can be formed is----->123
//difference is 321-123 = 198(output)

public class largestSmallestDiff {

	public static int diffLargeSmall(int num) {
		String s = Integer.toString(num);
		char arr[] = s.toCharArray();
		Arrays.sort(arr);

		String small = new String(arr);
		
        int sm = Integer.parseInt(small);
        
		String large = "";
		
		for (int i = arr.length - 1; i >= 0; i--) {
		
			large = large + arr[i]+"";
		}
		int lg = Integer.parseInt(large);
		
		int diff = lg-sm;
		return diff;
	}

	public static void main(String args[]) {
		int diff = diffLargeSmall(213);
		System.out.println(diff);
	}

}
