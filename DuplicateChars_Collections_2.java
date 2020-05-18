package javaPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateChars_Collections_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "When life gives you lemons, make lemonade";
		Map<Character,Integer> hm= new LinkedHashMap<Character,Integer>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if(hm.containsKey(c)) {
				int count = hm.get(c)+1;
				hm.put(c, count);
			}
		
		else {
			hm.put(c,1);
		}
	}
		for (Entry<Character,Integer> eachEntry : hm.entrySet()) {
			System.out.println("The letter "+eachEntry.getKey()+" occurs "+eachEntry.getValue()+" times");
		}
	}
}
