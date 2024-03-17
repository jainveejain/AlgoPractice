import java.util.Scanner;

public class RepeatCode {

//public static void main(String args[]) {
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//	int sum = 0;
//	/// 1 sum 0f n numbers
//	for(int i = 1;i<=n;i++) {
//		sum = sum + i;
//	}
//	System.out.println(sum);
//}
	
//	/// 2 prime number
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		boolean flag = true;
//		if (n == 0 || n == 1 || n == 2) {
//			flag = false;
//		}
//
//		for (int i = 2; i < n; i++) {
//			if (n % i == 0) {
//				flag = false;
//			}
//
//		}
//		if(flag==true) {
//			System.out.println("prime");
//		}
//		else{
//			System.out.println("Not prime");
//		}
//
//	}

	/// 3 String pallendrom ----->abcdcba

//	public static void main(String args[]) {
//	Scanner sc = new Scanner(System.in);
//	String n = sc.nextLine();
//	boolean flag = true;
//	for(int i = 0,j = n.length()-1;i<n.length()/2;i++,j--) {
//		if(n.charAt(i)!=n.charAt(j)) {
//			flag = false; 
//			break;
//			
//		}
//	}
//	
//	if(flag==true) {
//		System.out.println(" pallandrom");
//	}
//	else{
//	System.out.println("not pallandrom");
//	}
//	
//	}
	
	/// 4. paragraph pallindrom
	
//	public static void main(String args[]) {
//	Scanner sc = new Scanner(System.in);
//		String n = sc.nextLine();
//		
//	String[] arr = 	n.split(" ");
//	boolean flag =true;
//	for(int i = 0,j = arr.length-1;i<arr.length/2;i++,j--) {
//		if(!arr[i].equals(arr[j])) {
//			flag = false;
//			break;
//		}
//	}
//	if(flag==true) {
//		System.out.println(" pallandrom");
//	}
//	else {
//		System.out.println(" Not pallandrom ");
//		
//	}
//	}
    /// 5. Max,Min
//	public static void main(String args[]) {
//		int [] arr = {4,9,2,8,6,2,1,5};
//		for(int i = 0;i<=arr.length-2;i++) {
//			for(int j = i+1;j<=arr.length-1;j++) {
//				if(arr[i]>arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		int max = arr[arr.length-1];
//		int min = arr[0];
//		System.out.println(max);
//		System.out.println(min);
//	}
	/// 6. twoSum problem
	
//	public static void main(String args[]) {
//		int [] arr = {4,9,2,8,6,2,1,5};
//		int target = 11;
//		boolean flag = false; 
//		
//		int [] index = new int[2];
//		for(int i = 0;i<=arr.length-2;i++) {
//			for(int j = i+1;j<=arr.length-1;j++) {
//				if(arr[i]+arr[j]==target) {
//					  index[0] = i;
//					  index[1] = j;
//					  flag = true;
//					  break;
//				}
//			}
//			if(flag) {
//				break;
//			}
//			
//		}
//		
//		
//	System.out.println("["+index[0]+" "+index[1]+"]");
//		
//		
//	}
	
	///remove duplicates from arraylist
	
	
}
