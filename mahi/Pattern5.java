class Pattern5 
{
	public static void main(String[] args) 
	{
		int i,j,k;
		int n=10;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			for(k=1;k<=n-i;k++)
			{
				System.out.print(k);
			}
			
			for(int l=1;l<=i;l++)
			{
				System.out.print(" ");
			}
			System.out.println();
	}}
}
//Not completed
