class AddArrAll 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int a[]={45,60,85,35,66};
		for (int i=0;i<5;i++)
		{
			System.out.println(a[i]);
			sum+=a[i];
		}
		System.out.println("Sum of array is :"+sum);
	}
}
