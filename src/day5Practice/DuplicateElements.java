package day5Practice;

public class DuplicateElements {

	public static void main(String[] args) {
	int a[]= {2,3,4,5,6,3};
	boolean flag=false;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.print("found elements " + a[i]);
				flag=true;
				break;
			}
		}
	}
	if(flag==false) {
		System.out.println("no duplicates found");
	}
	}
	}