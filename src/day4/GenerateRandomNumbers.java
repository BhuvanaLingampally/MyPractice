package day4;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumbers {

	public static void main(String[] args) {
		Random rand=new Random();
		
		//int rand_int=rand.nextInt(100);  //for 100--> it returns the numbers from 0 to 99.... maximum value is 999
//System.out.println(rand_int);

//Double rand_dbl=rand.nextDouble(); // it returns the decimal values from 0.0 to less than 1..here we need not give any parameter
//System.out.println(rand_dbl);


//math approach
//System.out.println(Math.random());   // it prints only the decimal values directly

// apache commons-lang Api
		String randStr=RandomStringUtils.randomAlphabetic(5);
		System.out.println(randStr);
	
		String randNum=RandomStringUtils.randomNumeric(5);
		System.out.println(randNum);
		

}
