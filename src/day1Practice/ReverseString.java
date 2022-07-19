package day1Practice;

public class ReverseString {

	public static void main(String[] args) {
		String str="BALL";
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
	System.out.println("reverse of a string is :"+ rev);
	

	String s="CAT";
	String rever="";
	int lent=s.length();
	char a[]=s.toCharArray();
	
	for(int i=lent-1;i>=0;i--) {
	rever=rever+a[i];
	}
System.out.println("reverse is :"+ rever);
	
String g="APPLE";
String re="";
StringBuffer sb=new StringBuffer(g);
System.out.println(sb.reverse());
}
}