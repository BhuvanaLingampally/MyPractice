package day2Practice;

public class CountNoOfDigits {

	public static void main(String[] args) {
	int num=9876;
	int count=0;
	while(num!=0) {
		num=num/10;
		count++;
	}
	System.out.println("no of digits are :"+ count);
	}

}
