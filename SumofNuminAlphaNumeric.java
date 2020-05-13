package javaPractice;

public class SumofNuminAlphaNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "asdf1qwer9as8d7";
		String numString = input.replaceAll("\\D", "");
		System.out.println(numString);
		int num = Integer.parseInt(numString);
		int sum = 0;
		while(num%10!=0) {
			sum = sum+num%10;
			num = num/10;
		}
System.out.println("sum is"+sum);

	}

}
