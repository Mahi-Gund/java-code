import java.util.Scanner;

class NLoop
{
	public static void main(String args[]){
		
		int i,j,n;
		
		for (i=0;i<10;i++)//(Intialization;Condition;Increment/Decrement)
		{
			for(j=1;j<=10-i;j++)//The value of i will not increment till this loops condition be false.
			{
				System.out.print(j);/*The value of j is initialized by 1 then it will check the condition if true then 
			}							it will print j after printing the value it will go to loop again 
										and increment the value of j to 2 and so till the condition would be false.*/
			
				System.out.print("\n");//After the execution of this line it will go to the loop and will increment the value of i.
		}
	}
}