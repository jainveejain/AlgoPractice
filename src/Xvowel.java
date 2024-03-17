// we have to replace the two vowels coming consecutively by X in given string 
//given xvowel = "baeiout"; 
//for example  input -----> string s = "Be you not the others want to see you"
// output ------> X yX nX the Xhers want X sX yX

public class Xvowel {

	public static void main(String args[]) {
		String str = "Jainvy is married to Ponik";

		char arr[] = str.toCharArray();
		for (int i = 0; i <= arr.length - 2; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'b'
					|| arr[i] == 't') {
				if (arr[i + 1] == 'a' || arr[i + 1] == 'e' || arr[i + 1] == 'i' || arr[i + 1] == 'o'
						|| arr[i + 1] == 'u' || arr[i + 1] == 'b' || arr[i + 1] == 't') {

					// char carr []= {arr[i],arr[i+1]};
					// String s = new String(carr);

					String s = arr[i] + "" + arr[i + 1] + "";
					str = str.replace(s, "X");

				}
			}

		}
		System.out.println(str);

	}
}