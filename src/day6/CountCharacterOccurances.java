package day6;

public class CountCharacterOccurances {

	public static void main(String[] args) {
		String s="Java is OOPs Java Programming";
		int totalCount=s.length();
		int COuntAfterRemove=s.replace("a","").length(); //replacing "a" with empty space
int count=totalCount-COuntAfterRemove;
System.out.println("Number of occurances of a are : " +count);
	}

}
