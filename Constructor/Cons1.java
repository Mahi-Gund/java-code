class A
{
	void show()
	{
		System.out.println("Method");
	}
	A()	//Constructor invokes automatically=>when object is created it is called automatically.
	{
		System.out.println("Constructor");
	}
}
class Cons1 
{
	public static void main(String[] args) 
	{
		A a1=new A(); //	a1=referrence variable		=(Assignment Operator)   A()=>Calling of default constructor
		a1.show(); // Method is needed to call.
	}
}
