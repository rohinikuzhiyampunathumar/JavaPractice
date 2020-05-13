package javaPractice;

public class reverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ip =  "When the world realise its own mistake, corona will dissolve automatically";
		String ipCommaRemoved = ip.replaceAll(",", "");
		String[] str = ipCommaRemoved.split(" ");
		String[] newArr = new String[str.length];
		String rev = "";
		for(int i = 0; i <str.length; i++) {
			if(i%2!=0) {
				for(int j=str[i].length()-1; j>=0; j--) {
					rev=rev+str[i].charAt(j);
					if(j == 0) {
						newArr[i]=rev;
					}
				}
				rev = "";
			}
			else {
				newArr[i]=str[i];
			}
			
		}
		for(int i = 0; i <newArr.length; i++)
			System.out.print(newArr[i]+" ");
	}
	

}
