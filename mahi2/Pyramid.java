import java.util.Scanner;
class  Pyramid
{
	public static void main(String[] args) 
		
	{
		int i,j,k,n;
		char p;
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the value :");
		n=scr.nextInt();
		for (i=0;i<n;i++)
		{
			for(k=0;k<n-1;k++){
				System.out.print(" ");
			}
			p='A';
				for(j=0;j<=i+i;j++){
				System.out.print(p);
			if(j==i){p+=32;}
			if(i<n-1){
				p=(j<i)?++p:--p;
			}
			}
			System.out.print("\n");
			}	
		
	}
	
}

