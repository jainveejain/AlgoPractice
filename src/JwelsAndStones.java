

//Example 1:
//
//Input: jewels = "aA", stones = "aAAbbbb"
//Output: 3
//Example 2:
//
//Input: jewels = "z", stones = "ZZ"
//Output: 0


public class JwelsAndStones {
	
	    public static int numJewelsInStones(String jewels, String stones) {
	        char arrJewel[] = jewels.toCharArray();
	         char arrStones[] = stones.toCharArray();
	         int count = 0;
	        for(int i = 0;i<=arrJewel.length-1;i++){
	            for(int j = 0; j<=arrStones.length-1;j++){
	                if(arrJewel[i] == arrStones[j]){
	                    count++;
	                }
	            }
	        }
	        return count;
	    }
	    public static void main(String args[]) {
	    	 int count = numJewelsInStones("aA","aAAbbbb");
	    	 System.out.println(count);
	    }
	}


