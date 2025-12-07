//Static Variable
//How does Static works?

import java.util.Scanner;
class StaticDemo 
{
	static int x; // Static:- It is using it's own memory not the object memory but can share a copy of memory to object.
	public static void main(String[] args) 
	{
		StaticDemo d1=new StaticDemo();
		StaticDemo d2=new StaticDemo();
		StaticDemo d3=new StaticDemo();
		
		
		
		//d1.x=2000;
		//d2.x=6000;
		//d3.x=1000; 
					/*Here the execution will be done line by line so x will store 1000 in its storage because the value of 
					object d3.x=1000 will override the values of d2.x & d1.x */
		
		x=9000;
		
		System.out.println(x);		/*Now I commented the object initializing the value of x 
									so the result will be printing the value of x=9000 in all of them
									because x is sharing it's memory with the object.*/
		System.out.println(d1.x);
		System.out.println(d2.x);
		System.out.println(d3.x);
	}
}
