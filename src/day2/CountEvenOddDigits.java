package day2;

public class CountEvenOddDigits {

	public static void main(String[] args) {
		int num=986251234;
		int evenCOunt=0;
		int oddCount=0;
		
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				evenCOunt++;
			}
			else {
				oddCount++;
			}
		num=num/10;
		
		}
		System.out.println("number of even digits are : "+evenCOunt);
		System.out.println("number of odd digits are :"+ oddCount);
	}

}
