package day1;

public class ReverseString2 {

	public static void main(String[] args) {
		String str="BHUVANA";
		String rev="";
		int len=str.length();
		//using + concatination
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse of string is :"+rev);
		
		//using char a[] array
		/*char a[]=str.toCharArray();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];	
		}
	System.out.println("reverse of string is "+rev);*/
	}

}
