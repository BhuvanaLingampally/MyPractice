package person;

public class person {
public String name;
public String qualification;
public char gender;


public void details(String name, String q, char g)
{
	this.name=name;
	this.qualification=q;
	this.gender=g;
	System.out.println(name+" "+q+" "+g);
}

public static void main(String[] args)
{
	person p = new person();
	p.details("Harish", "B.tech", 'M');
	p.details("Bhuvana", "MBA", 'F');
	p.details("Kiran", "B.tech", 'M');
}



}
