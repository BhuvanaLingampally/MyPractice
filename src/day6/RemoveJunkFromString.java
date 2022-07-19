package day6;

public class RemoveJunkFromString {

	public static void main(String[] args) {
		String s="test #@$%^&*(*&^%)Selenium**&^%$$#%$^^automation";
		String t=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(t);
		
		String s1="Welc(*&#$^%&**ome1234";
		s1=s1.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s1);
	}

}
