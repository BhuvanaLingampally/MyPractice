package com.fam;

public class details {
public String firstName;
public  String lastName;
public int age;
public String contactNo;
public String village;
public details(String firstName, int age, String contactNo) {
	super();
	this.firstName = firstName;
	this.age = age;
	this.contactNo = contactNo;
}


public void val(String lastName, String village )
{
	this.lastName=lastName;
	this.village=village;
	System.out.println(firstName+" "+lastName+" "+age+" "+contactNo+" "+village);
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public String getContactNo() {
	return contactNo;
}
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}


 
@Override
public String toString() {
	return "details [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", contactNo=" + contactNo
			+ "]";
}
public static void main(String[]args) {
	details d = new details("Harish", 24, "9030570390");
	details d1 = new details("Thanvika", 24,"9074387843");
	details d2 = new details("kiran", 24,"9876784390");
	details d3 = new details("jamuna", 45,"9875483567");
	d.val("Lingampally", "Thimmapur");
	d1.val("Lingampally", "Thimmapur");
	d2.val("Lingampally", "Thimmapur");
	d3.val("Lingampally", "Thimmapur");
	details d4 = new details("Bhumanna", 45, "9509854554");
	details d5 = new details("Nagamani", 40, "9550354653");
	details d6 = new details("Rakesh", 21, "9345676543");
	d4.val("Mamidi","Maggidi");
	d5.val("Mamidi","Maggidi");
	d6.val("Mamidi","Maggidi");
//	details d1 = new details("Bhuvana",  "Lingampally",   24, "9542919551");
//	details d2 = new details("Harish",   "Lingampally",   29, "9030570390");
//	details d3 = new details("kiran",    "Lingampally",   24, "9876578984");
//	details d4 = new details("jamuna",   "Lingampally",   45, "9743890574");
//	details d5 = new details("Bhumanna",   "Mamidi",      45, "9505838982");
//	details d6 = new details("Nagamani",   "Mamidi",      40, "9550216230");
//	details d7 = new details("Rakesh",     "Mamidi",      21, "9666129260");
//	
//	
//	System.out.println(d1);
//	System.out.println(d2);
//	System.out.println(d3);
//	System.out.println(d4);
//	System.out.println(d5);
//	System.out.println(d6);
//	System.out.println(d7);
	
	
	
	
	
	
	
	
}	
	
}