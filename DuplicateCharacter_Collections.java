package javaPractice;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacter_Collections {
	public static void main(String[] args) {
		String str= "When life gives you lemons, make lemonade";
		//Set<Character> hs = new LinkedHashSet<Character>();
		Map<Character,Integer> hm =  new LinkedHashMap<Character, Integer>();
		for(int i = 0; i <str.length(); i++) {
			if(hm.containsKey(str.charAt(i))) {
				int count = hm.get(str.charAt(i))+1;
				hm.put(str.charAt(i), count);
			}
			
		else {
			hm.put(str.charAt(i), 1);
		}
		}
	
			for (Entry<Character,Integer> eachEntry : hm.entrySet()) {
				//System.out.println("The letter "+eachEntry.getKey()+" occurs "+eachEntry.getValue()+" times");
				//System.out.println("*****************");
				if(eachEntry.getValue()>1) {
					System.out.println("The letter "+eachEntry.getKey()+" occurs "+(eachEntry.getValue()-1)+" times as duplicate");
				}
			}
	}
}
