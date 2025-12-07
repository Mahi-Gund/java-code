import java.util.Scanner;
class PrimeNum 
{
	public static void main(String[] args) 
	{
		int i,n,count=0;
		System.out.println("Enter No");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for (i=1;i<=n;i++)
		{
			if (n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("It is Prime");
		}
		else{
			System.out.println("Not");
		}
		
		
	}
}
