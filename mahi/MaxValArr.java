import java.util.Scanner;
class MaxValArr 
{
	public static void main(String[] args) 
	{
		int size;
		System.out.println("Enter size of array :");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int a[]=new int[size];
		
		
		for (int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=0;
		max=a[0];
		for (int i=0;i<size;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
	}
}
