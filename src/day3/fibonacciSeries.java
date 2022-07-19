package day3;

public class fibonacciSeries {

	public static void main(String[] args) {
		int n1=1;
		int n2=2;
		int sum=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<10;i++) {
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
	}

}
