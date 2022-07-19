package day1;

public class ReverseString {

	public static void main(String[] args) {
	String str="ABCDE";
	System.out.println("actual string is :"+str);
	String rev="";
	
	int len=str.length();
	
for(int i=len-1; i>=0;i--) {
	rev=rev+str.charAt(i);
	
}
System.out.println("reverse of a string is :"+ rev);
	}

}
