import java.util.Scanner;
class LiftBreak4 
{
	public static void main(String[] args) 
	{
		int check,i;
		System.out.println("Enter Floor");
		Scanner sc=new Scanner(System.in);
		check=sc.nextInt();
		
		for(i=1;i<=24;i++){
			System.out.println(i);
			if(check==i){
				break;
			}
		}
	}
}
