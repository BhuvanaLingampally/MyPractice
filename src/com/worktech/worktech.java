package com.worktech;

public class worktech {
	public String brand;
	public String model;
	public int ram;
	public int storage;
	
	
	
	public void dialCall(String number) {
        System.out.println("Calling " + number + " from " + brand + ":" + model);
        }
	public void receiveCall(String number) {
		System.out.println(" Receiving Call from " + " number " + " on " + " brand " + ":" + model);
		
		
	}

}
