package day4;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int a[]= {2,5,8,4,6};
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {  //normal for loop
			sum=sum+a[i];
		}
System.out.println(sum);
	
int b[]= {3,4,9,10,7};
int s=0;
for(int value:b) {   // enhanced for loop or for each loop
	s=s+value;
}
	System.out.println(s);
	}

}
