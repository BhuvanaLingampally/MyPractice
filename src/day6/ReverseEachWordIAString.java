package day6;

public class ReverseEachWordIAString {

	public static void main(String[] args) {
		/*String str="welcome to java";   //original string
		String reverseString=" ";
		String[] words=str.split(" "); // split into words
for(String w:words) {
	String reverseWord=" ";
	for (int i=w.length()-1;i>=0;i--) {
		reverseWord=reverseWord+w.charAt(i);
	}
	reverseString=reverseString+reverseWord;
}
	System.out.println("Reverse of a string is :"+ reverseString);*/
		
		String str="welcome to java";   //original string
		String reverseString=" ";
		String[] words=str.split("\\s"); // split into words............ empty space and this one are equal
for(String w:words) {
	StringBuilder sb=new StringBuilder(w);
	sb.reverse();
	reverseString=reverseString+sb.toString()+" ";
	
}
System.out.println(reverseString);
	}

}
