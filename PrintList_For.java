package javaPractice;

import java.util.ArrayList;
import java.util.List;

public class PrintList_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = {'B','u','g','a','t','t','i',' ','C','h','i','r','o','n'};
		List<Character> arr = new ArrayList<Character>();
		for (char eachchar : ch) {
			arr.add(eachchar);
		}
		for(int i = 0; i <arr.size(); i++) {
			System.out.print(arr.get(i));
		}
	}

}
