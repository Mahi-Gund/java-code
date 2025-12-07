//How can we call Constructor in a Constructor in same class?
// This Keyword
//But constructor can't be called it automatically invoked.

class ConsDemo2 
{
	int a,b;
	
	ConsDemo2(){
		this(1000);
		}
	ConsDemo2(int x){
		this(x,2000);
		}
	ConsDemo2(int x,int y){
		a=x;
		b=y;
		}
		
	void m2(){
		System.out.println("Ans ="+(a+b));
		}
		
	public static void main(String[] args) 
	{
		ConsDemo2 d1=new ConsDemo2();
		
		d1.m2();
	}
}
