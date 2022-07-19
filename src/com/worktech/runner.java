package com.worktech;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
worktech my_iPhone_11 = new worktech();
worktech my_iPhone_XS = new worktech();
worktech OnePlus_7t = new worktech();
 
System.out.println(my_iPhone_11.brand + " " +  my_iPhone_11.model + " " +  my_iPhone_11.ram + " " +  my_iPhone_11.storage);
my_iPhone_11.dialCall("9732130450");
my_iPhone_11.receiveCall("9732130450");


System.out.println(my_iPhone_XS.brand + " " +  my_iPhone_XS.model + " " +  my_iPhone_XS.ram + " " +  my_iPhone_XS.storage);
my_iPhone_XS.dialCall("9732130450");
my_iPhone_XS.receiveCall("9732130450");

System.out.println(OnePlus_7t.brand + " " +  OnePlus_7t.model + " " +  OnePlus_7t.ram + " " +  OnePlus_7t.storage);
OnePlus_7t.dialCall("9732130450");
OnePlus_7t.receiveCall("9732130450");




	}

}
