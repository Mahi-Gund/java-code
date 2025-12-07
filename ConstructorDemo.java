/* Constructor :- 1.Construct memory of object.
					2.Don't have return type.
					3.Automatically invoked when objects created.
					4.Default constructor always work Top-->Down
					*/
					
//Constructor Overloading
					
					
class ConstructorDemo 
{
	int a,b,c;
	
	ConstructorDemo(){//Default constructor
		a=9000;
		}
	
	ConstructorDemo(int x){//Single Paramaterized Constructor 
		a=x;
		}
		
	ConstructorDemo(int x,int y){//Double Paramaterized Constructor 
		a=x;
		b=y;
		}
	
	void m1()
	{
		System.out.println("A="+a);
	}
	
	void m2()
	{
		System.out.println("Sum of the number is "+(a+b));
	}
	public static void main(String[] args) 
	{
		ConstructorDemo d1=new ConstructorDemo();
		ConstructorDemo d2=new ConstructorDemo(1000);
		ConstructorDemo d3=new ConstructorDemo(250,250);
		
		d1.m1();
		d2.m1();
		d3.m2();	}
}
