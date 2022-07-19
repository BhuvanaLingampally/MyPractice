package day6Practice;

public class CountThewords {

	public static void main(String[] args) {
		String s="Java is program";
		int count=1;
		int n=s.length();
		for(int i=0;i<n-1;i++) {
			if((s.charAt(i)==' ') && (s.charAt(i)!=' ')) {
			count++;	
			}
		}
System.out.println("Number of words present are:"+count);
	}

}
