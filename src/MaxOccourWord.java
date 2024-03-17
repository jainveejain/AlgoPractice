import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

// we have one string and we have to count the max occourence of word
//Input ----->String s = "Lion is Scariest animal . Lion has big teeth and teeth are sharp.Lion can kills human "
//Output ------> max occour word Lion

public class MaxOccourWord {
	public static void main (String []args) {
	
	String str ="my jainvy you jainvy we  our happen to you jainvy say it my";
	String str1[]=str.split(" ") ;
	HashMap<String,Integer> map = new HashMap<>();
	for(int i = 0;i<=str1.length-1;i++) {
		Integer count = map.get(str1[i]);
		if(count==null) {
			map.put(str1[i], 1);
		}
		else {
			map.put(str1[i], count+1);
		}
	}
	Set<Entry<String,Integer>> entrySet= map.entrySet();
	
	int max = 0;
	String s =null;
	
	for(Entry<String,Integer> es : entrySet) {
		String key = es.getKey();
		Integer value = es.getValue();
		if(max<value) {
			max = value;
			s = key;
		}
	}
	System.out.println(s);
	System.out.println(max);
	
	
	
	
	
	
	
	
}
}