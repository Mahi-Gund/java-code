import java.util.Scanner;
class  Demo2
{
	public static void main(String[] args) 
	{
		int a,b,c,d;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the value of A,B,C,D");
		
		a=scr.nextInt();
		b=scr.nextInt();
		c=scr.nextInt();
		d=scr.nextInt();
		
		if(a>b && a>c && a>d){
			System.out.println("A is the Greater Number ");
		}
		else if (b>a && b>c && b>d)
		{
			System.out.println("B is the Greater Number");
		}
		else if(c>a && c>b && c>d)
		{
			System.out.println("C is the Greater Number");
		}
		else{
			System.out.println("D is the Greater Number");
		}
			
	
	}
}
