package day6Practice;

public class ReverseEachWordInAString2 {

	public static void main(String[] args) {
		String str="Welcome to java program";
		int n=str.length();
		String reverseString=" ";
		String[] words=str.split("\\s");
		for(String w:words) {
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reverseString=reverseString+sb.toString()+" ";
		}
System.out.println(reverseString);
	}

}
