class Pattern10
{
	public static void main(String[] args) 
	{
		int i,j,k;
		int n=5;
		for(i=1;i<=n;i++){
			
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(k=1;k<=n-i;k++){
				System.out.print(" ");
			}
			
			
			
			System.out.println();
			}
		
	}
}
