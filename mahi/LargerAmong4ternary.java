import java.util.Scanner;

class  LargerAmong4ternary
{
	public static void main(String[] args) 
	{
		int a,b,c,d;
		int greaterNum;
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the values of A,B,C,D");
		
		a=scr.nextInt();
		b=scr.nextInt();
		c=scr.nextInt();
		d=scr.nextInt();
		
		greaterNum = ( a>b && a>c && a>d)? a : (b>c && b>d) ? b : (c>d) ? c: d;
		
		System.out.println(greaterNum);
	}
}
