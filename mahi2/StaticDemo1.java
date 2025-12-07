//Static variables and Methods
//How does it works together static variables and methods?

import java.util.Scanner;
class StaticDemo1 
{
	static int x=3000; //Static variable and methods which one would be declared first will execute first.
	
	static {			//Here if we initialize the value of x after our method so we will get error.
		x=x*10;
	}
	
	public static void main(String[] args) 
	{
		x=x+9000;	//Here the value of x would be x=30000+9000 = 39000
		System.out.println(x); 
	}
}
