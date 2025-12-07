import java.util.Scanner;

class Result1
{
	float mathematics1,mathematics2,mathematics3,datastruct,oops,sum,percent;
	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the Marks of M1");
		mathematics1=scr.nextFloat();	
		
		System.out.println("Enter the Marks of M2");
		mathematics2=scr.nextFloat();	
		
		System.out.println("Enter the Marks of M3");
		mathematics3=scr.nextFloat();	
		
		System.out.println("Enter the Marks of EDS");
		datastruct=scr.nextFloat();	
		
		System.out.println("Enter the Marks of M1");
		oops=scr.nextFloat();
		
		if(m1<40 && m2<40 && m3<40 && eds<40 && java<40){
			System.out.println("ATKT");
		}
			else{
				System.out.println("Pass");
			}
	}
}
