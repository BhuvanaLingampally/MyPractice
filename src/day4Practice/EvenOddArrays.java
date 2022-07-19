package day4Practice;

public class EvenOddArrays {

	public static void main(String[] args) {
		int a[]= {5,1,6,8,12,11};
		System.out.println("Even Arrays are :");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) 
				System.out.println(a[i]);
			}
		System.out.println("Odd Arrays are:");
			for(int i1=0;i1<a.length;i1++) {
				if(a[i1]%2!=0)
					System.out.println(a[i1]);
			}
		}
		}

	


