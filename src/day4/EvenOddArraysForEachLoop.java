package day4;

public class EvenOddArraysForEachLoop {

	public static void main(String[] args) {
		int a[]= {2,4,6,8,3,5,7,9};
		System.out.println("even array numbers are :");
		for(int value:a) {
			if(value%2==0) {
				System.out.println(value);
			}
		}
		System.out.println("odd array numbers are:");
for(int value:a) {
	if(value%2!=0) {
		System.out.println(value);
	}
}
	}

}
