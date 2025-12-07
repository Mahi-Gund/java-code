/*	Private Constructor=> It can work for only that class in which it exists.	*/
class PriCons 
{
	private PriCons()
	{
		System.out.println("Private Constructor");
	}
	public static void main(String[] args) 
	{
	PriCons p1=new PriCons();	
	}
}
