package day5;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String arr[]= {"Java","C++","python","C++","selenium","Java"};
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("found duplicate element :"+ arr[i]);
			         flag=true;
				}
				}
			}
		if(flag==false) {
			System.out.println("duplicate element not found");
		}
	}
	}


