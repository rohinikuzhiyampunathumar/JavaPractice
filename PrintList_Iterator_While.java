package javaPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintList_Iterator_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = {'B','u','g','a','t','t','i',' ','C','h','i','r','o','n'};
		List<Character> arr = new ArrayList<Character>();
		for (char eachchar : ch) {
			arr.add(eachchar);
		}
		Iterator<Character> it = arr.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		
	}

}
