
package day5;

import java.util.HashSet;

public class DupElementsUsingHashSet {
	public static void main(String[] args) {
		String arr[]= {"Java","C++","python","selenium","java","java"};
		boolean flag=false;
		HashSet hs=new HashSet();
		for(String l:arr) {
			if(hs.add(l)==false) {
				System.out.println("Found Duplicate Elements :"+l);
				flag=true;
			}
			}
		if(flag==false) {
			System.out.println("No Duplicate elements found");
		}
	}

}
