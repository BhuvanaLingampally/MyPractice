package day6;

import java.util.Arrays;

public class BubbleSortArray {

	public static void main(String[] args) {
		int a[]= {2,6,7,5,1};
		System.out.println("Arrays before sorting are :"+Arrays.toString(a));
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Arrays after sorting are: "+ Arrays.toString(a));

	}

}
