class BubbleSort 
{
	public static void main(String[] args) 
	{
		int a[]={16,26,72,12,7,2};
		int i,j,temp=0;
		
		for (i=0;i<6;i++)
		{
			for(j=0;j<5;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[i];
					a[i]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Show data");
		for(i=0;i<6;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
}


