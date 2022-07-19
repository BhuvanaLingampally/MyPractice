package day4Practice;

import java.util.Random;

public class GenerateRandomNumberString {

	public static void main(String[] args) {
		Random rand=new Random();
		
		int rand_num=rand.nextInt(1000);
		System.out.println(rand_num);
		
		double rand_dbl=rand.nextDouble();
		System.out.println(rand_dbl);
System.out.println(Math.random());
	}

}
