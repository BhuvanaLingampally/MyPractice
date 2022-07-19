package day1Practice;

public class PalindromeString {

	public static void main(String[] args) {
		String str="mom";
		String rev="";
		String org_String=str;
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			}
System.out.println("rev of a string is:"+rev);
	
	if(org_String.equals(rev)) {
		System.out.println(org_String+" is palindrome string");
	}
	else {
		System.out.println(org_String+" is not palindrome string ");
	}
	}

}
