import java.util.Scanner;

class Leapyear 
{
	public static void main(String[] args) 
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your birth year :");
		year=sc.nextInt();
		
		String Leapcheck=((year%4==0 && year%100!=00) || (year%400==0))? "Leap Year" : "Not" ;
		
		System.out.println(Leapcheck);
	}
}
