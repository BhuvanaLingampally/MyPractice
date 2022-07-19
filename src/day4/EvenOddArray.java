package day4;

public class EvenOddArray {

	public static void main(String[] args) {
		int a[]= {3,9,5,6,8,10};
		System.out.println("even array numbers are :");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		 System.out.println("odd array numbers are :");
	for(int i1=0;i1<a.length;i1++) {
		if(a[i1]%2!=0) {
			System.out.println(a[i1]);
		}
	}
		}

}
