import java.util.Scanner;
class Average 
{
	public static void main(String[] args) 
	{
		double a,b,c,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number A,B,C");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		avg=(a+b+c)/3;
		System.out.println("The average of the numbers is :"+avg);
	}
}
