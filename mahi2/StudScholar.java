import java.util.Scanner;
class  StudScholar
{
	public static void main(String[] args) 
	{
		int standard,age;
		double percent;
		String gender;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Class");
		standard=sc.nextInt();
		System.out.println("Enter Age");
		age=sc.nextInt();
		
		System.out.println("Enter percentage");
		percent=sc.nextDouble();
		
		System.out.println("Enter Gender");
		gender=sc.nextLine();
		
		if(standard==12 && age>=17  && percent>=90)
		{
			if(gender=="female"){
				
			System.out.println("She is eligible for the Scholarship");
		}
		}
		else{
			System.out.println("Not eligible");
		}
		
	
	}
}
