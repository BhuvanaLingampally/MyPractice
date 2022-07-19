package day4Practice;

public class EvenOddArraysUsingForEachLoop {

	public static void main(String[] args) {
		int a[]= {2,3,9,5,4};
		System.out.println("Even Arrays are :");
		for(int value:a) {
			if(value%2==0) {
				System.out.println(value);
		}

	}
System.out.println("Odd Arrays are :");
for(int value:a) {
	if(value%2!=0) {
		System.out.println(value);
	}
}
}
}