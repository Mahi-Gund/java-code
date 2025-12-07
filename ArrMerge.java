class ArrMerge 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5},b[]={6,7,8,9,10};
		int i,index=0;
		int c[]=new int[10];
		for(i=0;i<5;i++)
		{
			c[index]=a[i];
			index++;
		}
		for(i=0;i<5;i++)
		{
			c[index]=b[i];
			index++;
		}
		
		for(i=0;i<10;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
	}
}
