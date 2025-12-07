import java.util.Scanner;
class SimpleInt 
{
	public static void main(String[] args) 
	{
		double si,principle,rate,time;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle");
		principle=sc.nextDouble();
		System.out.println("Enter Rate");
		rate=sc.nextDouble();
		System.out.println("Time");
		time=sc.nextDouble();
		
		si=(principle*rate*time)/100;
		System.out.println("SI :"+si);
	}
}
