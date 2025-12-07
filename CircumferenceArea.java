import java.util.Scanner;

class CircumferenceArea 
{
	public static void main(String[] args) 
	{
		int choice;
		double radius;
		double circumference;
		double area;
		Scanner  scr=new Scanner(System.in);
		System.out.println("For Circumference enter 0 & For area 1");
		System.out.println("Enter your choice");
		choice=scr.nextInt();
		
		if(choice!=0 && choice !=1){
			
			System.out.println("Invalid output");
			}
			
		 if(choice==0)
			{
			System.out.println("Enter the radius");
			radius=scr.nextDouble();
			
			circumference = 2*(3.14)*(radius);
			System.out.println("The circumference is :" +(circumference));
			}
			
		else if(choice==1)
			{
			System.out.println("Enter the radius");
			radius=scr.nextDouble();
			
			area = (3.14)*(radius)*(radius);
			System.out.println("The area is :" +(area));
			}
	}
	
	}