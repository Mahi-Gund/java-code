// Copy Constructor
class A
{
	int a,b;
	A(int x,int y)
	{
		a=x;
		b=y;
	}
	A(A ref)	//Copy Constructor
	{
		a=ref.a;
		b=ref.b;
		System.out.println(a+b);
		
	}
		
}
class  CopyCons
{
	public static void main(String[] args) 
	{
		A a1=new A(5,6);
		A a2=new A(a1);//Creating object for Copy constructor.
	}
}
