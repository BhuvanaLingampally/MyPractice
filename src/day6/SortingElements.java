package day6;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {
		int a[] = { 2, 9, 5, 7, 6, 8, 4, 3, 1 };
		System.out.println("Arrays before sorting are :" + Arrays.toString(a));
		//Approach1
		/*Arrays.sort(a);
		System.out.println("Arrays after sorting are :" + Arrays.toString(a));*/
		
		//Approach2
	Arrays.parallelSort(a);
		System.out.println("Arrays after sorting are:"+Arrays.toString(a));
		
		//Reverse Descending order
		Integer b[]= {2,4,6,8,5,3};  // here we need to use Wrapper class integer we don't use primitive datatype int
System.out.println("Arrays beforesorting are :"+Arrays.toString(b));
		Arrays.sort(b,Collections.reverseOrder());
System.out.println("Arrays after sorting are :"+Arrays.toString(b));
	}

}
