package day6Practice;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		String str= "Java is a oops program";
		String reverseString=" ";
		String[] words=str.split(" ");
		int n=str.length();
	
		for(String w:words) {
			String reverseWord=" ";
			for(int i=w.length()-1;i>=0;i--) {
				reverseWord=reverseWord+w.charAt(i);
			}
		reverseString=reverseString+reverseWord;
		}
		System.out.println("Reverse is :"+reverseString);
	}

}
