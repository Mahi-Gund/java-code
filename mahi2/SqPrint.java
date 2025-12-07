import java.util.Scanner;
class SqPrint 
{
	public static void main(String[] args) 
	{
		int n=100,i,square,check;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		check=sc.nextInt();
		for(i=1;i<=n;i++){
			square=i*i;
			System.out.println(square);
			if(check==i){
				break;
			}
		}
		}
	}

