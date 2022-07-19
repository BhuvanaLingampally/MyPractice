package day3Practice;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a=20,b=10,c=25;
		if(a>b && a>c) {
			System.out.println("a is the largest number");
		}
		else if(b>a && b>c) {
			System.out.println("b is the largest number");
		}
		else if(c>a && c>b){
			System.out.println("c is the largest number");
		}

		int d=30,e=35,f=40;
		int largest=f>(d>e?d:e)?f:(d>e?d:e);
		System.out.println(largest +" is the largest number");
	}

}
