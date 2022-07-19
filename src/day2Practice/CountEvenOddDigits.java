package day2Practice;

public class CountEvenOddDigits {

	public static void main(String[] args) {
		int num=87343;
		int evecount=0;
		int oddcount=0;
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				evecount++;
			}
			else {
				oddcount++;
			}
			num=num/10;
		}
	System.out.println("no of even digits are :"+evecount);
	System.out.println("no of odd digits are :"+oddcount);
	}

}
