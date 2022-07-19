package day1;

public class ReverseNumber2 {

	public static void main(String[] args) {
		int num=9087;
		int rev=0;

		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
		System.out.println(sb.reverse());*/

		StringBuilder sbd=new StringBuilder();
		sbd.append(num);
		StringBuilder reverse=sbd.reverse();
		System.out.println(reverse);
		
	}

}
