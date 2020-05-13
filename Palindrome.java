package javaPractice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str =  "abcabc";
String reverse = "";
for(int i = str.length()-1; i>=0; i--) {
	reverse = reverse+str.charAt(i);
}

if(str.equals(reverse)) {
	System.out.println("Yes, Palindrome");
}
else {
	System.out.println("no, not a palindrome");
}
//method 2
//int num = -1;
//int count = 0;
//		char[] ch = str.toCharArray();
//		char[] ch1 = new char[ch.length];
//		for(int i = ch.length-1; i>=0; i--) {
//			ch1[count] = ch[i];
//			count++;
//		}
//		for(int i = 0; i <ch.length; i++) {
//			if(ch[i]!=ch1[i]) {
//			System.out.println("No, not a palindrome");
//			break;
//			}
//			else {
//				num++;
//			}
//		}
//		if(num == ch.length-1) {
//			System.out.println("Yes, a palindrome");
//		}
	}
	

}
