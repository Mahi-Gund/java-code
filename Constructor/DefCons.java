// Default Constructor

import java.util.Scanner;
class A
{
	int a,b,c,i=1;
	A()
	{
		System.out.println("Default Constructor");
		System.out.println("Enter any three number : ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	}
	void avg()
	{
		System.out.println((a+b+c)/3);
	}
	void table()
	{
		if(i<=10){
			System.out.println(i*a);
			i++;
			table();
		}
		
	}
}
class DefCons 
{
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.avg();
		a1.table();
	}
}
