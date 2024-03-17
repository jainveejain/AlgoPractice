import java.util.Scanner;
//input ----> 5,2
//output----->[1,2,3,4,5]
//public static int pairs(int k, List<Integer> arr) {
//    // Write your code here
//    int count = 0;
//    for(int i = 0;i<=arr.size()-1;i++){
//        for(int j =i+1;j<=arr.size()-1;j++){
//            if(arr.get(i)-arr.get(j)==k || arr.get(j)-arr.get(i)==k){
//                count = count+1;
//            }
//        }
//    }
//    return count;
//
//    }
//
//}
public class TwoSumProblem {
	public static int[] achieveTarget(int arr[], int target) {
		for(int i = 0;i<=arr.length-1;i++) {
			for(int j =i+1;j<=arr.length-1;j++) {
				if(arr[i]+arr[j]==target) {
				int	arr1[] = {i,j};
				return arr1;
				}
			}
		}
		return null;
		
	}

	public static void main(String args[]) {
		int arr[] = {2,7,3,5,4,0,9,6};
		Scanner sc = new Scanner(System.in);
		 int target = sc.nextInt();
		int index[] = achieveTarget(arr,target);
		for(int n : index) {
			System.out.println(n);
		}

	}

}
