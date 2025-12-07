class Pattern17
{
	public static void main(String[] args) 
	{
		int i,j,k;
		int n=10;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<n-i;j++){
				int sum=i+j;
				if(sum%2==0){
					System.out.print("1");
				}else{
					System.out.print("0");
				}
			}
			for(k=1;k<=i;k++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
