package javaPractice;

public class LetterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "you have no choice other than following me";
		int count = 0;
//**********method 1********************
		String str = input.toLowerCase();
		for(int i = 0; i <str.length(); i++) {
			if(str.charAt(i)=='o') {
				count++;
			}
		}
		System.out.println("O occurs "+count+" times");
//***********method 2****************************
	char[] ch = input.toCharArray();
	for(int i = 0; i <ch.length; i++) {
		if(ch[i]=='o') {
			count++;
		}
	}
	System.out.println("o occurs "+count+" times");
	}

}
