package day1Practice;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=98489;
		int rev=0;
		int act_num=num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
System.out.println("rev of a no is :"+rev);
	
if(act_num==rev) {
	System.out.println(act_num+" is palindrome");
}
else {
	System.out.println(act_num+" is not palindrome ");
}
	
	}

}
