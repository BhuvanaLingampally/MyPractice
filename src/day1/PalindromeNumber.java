package day1;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=34543;
		int org_num=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
System.out.println("reverse of a number is :"+ rev);
	
	if(org_num==rev) {
		System.out.println(org_num+ " is palindrome");
	}
	else {
		System.out.println(org_num + " is not palindrome");
	}
	}
	}