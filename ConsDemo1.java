/*Super Keyword :- 1.It Passes values from derived class constructor to base class constructor.
					2.Must be used in the first line of constructor. */
					
//How it works?

//Derive to base.
import java.util.Scanner;
class  Base
{
	int a;
	
	Base(int x){
		a=x;
	}
}
	class ConsDemo1 extends Base
	{
		int b,c;
		ConsDemo1(int x,int y,int z){
			super(x); //It is storing the value of x in a.
			b=y;
			c=z;
	}
	void m1(){
		System.out.println("A+B+C : "+(a+b+c));
	}
	public static void main(String[] args) 
	{
		ConsDemo1 d1=new ConsDemo1(45,55,100);/*We are giving the value in the ConsDemo1 of x but it is storing the value in
												in the Base class parameter and then a=x */
		
		d1.m1();
	}
}
