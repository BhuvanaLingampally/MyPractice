package day5;

public class MaxAndMinElementsInArray {

	public static void main(String[] args) {
		int a[]= {20,25,30,35,60,50};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
System.out.println("Maximum number is :"+ max);

int b[]= {5,10,15,20,40};
int min=b[0];
for(int i=1;i<b.length;i++) {
	if(b[i]<min) {
		min=b[i];
	}
}
System.out.println("Minimum number is :"+ min);
}
}
