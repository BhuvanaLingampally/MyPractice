package day3;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a=20;
		int b=10;
		int c=30;
		
		if(a>b && a>c) {
			System.out.println(a+" is the largest number");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is the largest number ");
		}
		else {
			System.out.println(c+" is the largest number");
		}
		
		//using ternery operation
	int f=2;
	int g=3;
	int h=4;
	
	int largest1=f>g?f:g; // if f>g true then it results f or.. if f>g false then it results g
	int largest=h>largest1?h:largest1;
	// int largest=h>(f>g?f:g)?h:(f>g?f:g);   ----> directly
	
	System.out.println(largest+" is the largest no");
	
	}

}
