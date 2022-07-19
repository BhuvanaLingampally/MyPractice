package day5Practice;

import java.util.HashSet;

public class DuplicateElementsUsinghashset {

	public static void main(String[] args) {
	int a[]= {5,6,3,4,5};
	boolean flag=true;
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j]) {
			System.out.println("Found element " + a[i]);
		}
	}
}
	if(flag==false) {
		System.out.println("element not found");
	}
	}
}
