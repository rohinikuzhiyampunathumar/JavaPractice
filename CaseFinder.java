package javaPractice;

public class CaseFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "1. It is Work from Home not Work for Home";
		char[] ch = str.toCharArray();
		int space = 0;
		String strUpper = str.replaceAll("[^A-Z]", "");
		String strLower = str.replaceAll("[^a-z]", "");
		String strNum = str.replaceAll("\\D", "");
		for(int i = 0; i <ch.length; i++) {
			if(Character.isSpaceChar(ch[i])) {
				space++;
			}
		}
		
		System.out.println("The number of upper case is "+strUpper.length());
		System.out.println("The number of lower case is "+strLower.length());
		System.out.println("The number of number case is "+strNum.length());
		System.out.println("The number of spaces is "+space);
	}

}
