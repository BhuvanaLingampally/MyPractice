package day3;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int num=13;
		int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count++;
			}
			if(count==2) {
				System.out.println("prime number");
			}
			else {
				System.out.println("not prime number");
			}
		}
		else {
			System.out.println("not prime number");
		}

	}

}
