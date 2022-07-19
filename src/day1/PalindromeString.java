package day1;

public class PalindromeString {

	public static void main(String[] args) {
		String str="malayalam";
		String rev="";
		String org_str=str;
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
System.out.println("reverse of a string is :"+rev);
if(org_str.equals(rev)) {
	System.out.println(org_str+" is palindrome string");
}
else {
	System.out.println(org_str+" is not palindrome ");
}
		/*char a[]=str.toCharArray();
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
	System.out.println("rev is "+rev);
	if(org_str.equals(rev)) {
		System.out.println(org_str+" is palindrome ");
	}
	else {
		System.out.println(org_str+" is not palindrome ");
	}*/
	
	}

}
