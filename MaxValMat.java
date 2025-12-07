class MaxValMat 
{
	public static void main(String[] args) 
	{
		int i,j,max=0;
		int a[][]={{100,255,301},{46,50,69},{74,82,95}};
		max=a[0][0];
		for (i=0;i<3;i++)
		{
		
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
				
				if(max<a[i][j])
				{
					max=a[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("Max Value is:"+max);
	}
}
