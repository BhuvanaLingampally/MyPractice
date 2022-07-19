package day5;

public class MissingNumberArray {

	public static void main(String[] args) {
		//Array should not have duplicates
		//Array no need to be in sorted order
		//Array values should be in range like 1 to 5 or 6 to 10
		
		int a[]= {1,2,3,4,5,6,7,9,10};
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
System.out.println("Sum of Array elements are :"+sum1);
int sum2=0;
for(int i=1;i<=10;i++) {
	sum2=sum2+i;
}
System.out.println("Sum2 array elements are : "+sum2);
System.out.println("Missing number is : "+ (sum2-sum1));
	}

}
