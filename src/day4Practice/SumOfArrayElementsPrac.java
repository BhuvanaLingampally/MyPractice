package day4Practice;

public class SumOfArrayElementsPrac {

	public static void main(String[] args) {
		int a[]= {2,6,9,5,7,1};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		int b[]= {8,9,10};
		int summ=0;
		for(int value:b) {
			summ=summ+value;
		}
		System.out.println(summ);

	}

}
