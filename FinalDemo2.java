//Final Keyword in the Methods
	
class FinalDemo2
{
	void m1(final int x){
		System.out.println("X="+x);
	}
	
	public static void main(String[] args) 
	{
		int x=100; //Here we are initializing the value 100 but it's not changing on the time of execution.
		FinalDemo2 d1=new FinalDemo2();
		
		for(int i=1;i<=10;i++)
		{
			d1.m1(5);
		}
	}
}
