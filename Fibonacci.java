import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args) 
	{
		int a,i,f=0,s=1,t=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		a=sc.nextInt();
		
		for (i=1;i<=a;i++)
		{
			System.out.println("F= "+f);
			t=f+s;
			f=s;
			s=t;
			
		}
		
	}
}
