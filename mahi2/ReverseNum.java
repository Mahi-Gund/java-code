import java.util.Scanner;
class ReverseNum 
{
	public static void main(String[] args) 
	{
		int n,s=0,r;
		System.out.println("Enter Number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		System.out.println("Ans="+s);
	}
}
