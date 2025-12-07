import java.util.Scanner;

class NLoop2  
{
	public static void main(String[] args) 
	{
		int i,j,k;
		
		for (i=0;i<=10;i++)
		{	
			for(j=0;j<=i;j++){
				System.out.print("*");
				}									//Both the loop work at the same time because they are in the same loop	
				
				for(k=0;k<10-i;k++){	/*Used this loop for showing the space remaining in the row 
											Here checking condition 0<10-0*/
				System.out.print("#");
				}
					
				System.out.print("\n");
		}
	}
}
