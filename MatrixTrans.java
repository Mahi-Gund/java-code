class MatrixTrans 
{
	public static void main(String[] args) 
	{
		int i,j;
		int a[][]={{100,255,301},{46,50,69},{74,82,95}};
		
		for (i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Trasposed Matrix");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[j][i]+"\t");
			}
			System.out.println();
		}
	}
}
