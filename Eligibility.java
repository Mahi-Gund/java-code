import java.util.Scanner;
class Eligibility 
{
	public static void main(String[] args) 
	{
		int age,gender,choice;
		
		Scanner scr=new Scanner(System.in);
		System.out.println("For Male press 1 & For female 0");
		gender=scr.nextInt();
		
		/*choice=(gender==0)?male : (gender==1)?female : InvalidInput;
		System.out.println("Entered Gender is :"+choice); */
		if(gender==0){
			System.out.println("Female");
		}
		else if (gender==1){
			System.out.println("Male");
		}
		System.out.println("Enter your age :");
		age=scr.nextInt();
		
		if (age<18){
			System.out.println("Not eligible for voting");
		}
		else{
			System.out.println("Eligible for voting");
		}
	}
}
