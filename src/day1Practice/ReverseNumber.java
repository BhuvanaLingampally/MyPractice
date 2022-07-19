package day1Practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=97645;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
System.out.println(rev);

int no=875;
int r=0;
StringBuilder sbd=new StringBuilder();
sbd.append(no);
System.out.println(sbd.reverse());


int n=3210;
int re=0;
StringBuffer sf=new StringBuffer(String.valueOf(n));
System.out.println(sf.reverse());

	}

}
