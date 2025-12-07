class Patterns 
{
	public static void main(String[] args) 
	{
		int a[][]=new int[3][3];
		int i,j;
		
		for (i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			if(i==j)
			{
				a[i][j]=0;
				
			}
			else{
				a[i][j]=1;
				
				}
			}
		}
		for (i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{	
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
				
	}
}
