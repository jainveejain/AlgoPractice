

//input ----> [7,6,4,3,1]
//output----->0
//input----> [7 ,1,5,2,6,4]
//output----->5
public class MaxStockProfit {
	public static int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 0;i<=prices.length-2;i++){
            for(int j = i+1;j<=prices.length-1;j++){
                if(prices[j]-prices[i]>max){
                    max = prices[j]-prices[i];
                }
            }
        }
        return max ;
	}
	public static void main(String args []) {
		int [] prices = {7,1,5,2,6,4};
		
		int max = maxProfit(prices);
		System.out.println(max);
	}

}
