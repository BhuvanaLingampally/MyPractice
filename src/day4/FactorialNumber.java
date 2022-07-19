package day4;

public class FactorialNumber {

	public static void main(String[] args) {
		int num=5;
		long factorial=1;
		
		/*for(int i=1;i<=num;i++) {  // 5!=1*2*3*4*5=120...loop in increasing order
			factorial=factorial*i;
		}
System.out.println("factorial of a number is :"+ factorial);*/

int no=5;
for(int i=num;i>=1;i--) {  // 51=5*4*3*2*1=120..loop in decreasing order
	factorial=factorial*i;
}
System.out.println("factorial of number is :"+ factorial);
	}

}
