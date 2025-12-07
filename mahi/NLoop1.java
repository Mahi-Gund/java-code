import java.util.Scanner;

class NLoop1 
{
	public static void main(String[] args) 
	{
		int i,j,n;
		
		for(i=0;i<10;i++){//Here condition 0<10 is true then it will do whatever inside the loop
			
			for(j=0;j<=i;j++){/*Here condition 0<=0 is true then it will print the value of j after that increment the value of j to 1
								but the condition will not be true because 1<=0 because the value of i is still 0.*/
								
								/*Second time it will check 0<=1 because the value of i is incremented the condition would be true
								so it will print 0 then increment the value of j to 1 again check the condition 1<=1 is true then 
								will print 1 at same line it's output will be 0 1*/
				System.out.print(j);
			}
			System.out.print("\n");//After this it will go to increment the value of i to 1 and again we will check the condition.
		}
	}
}
