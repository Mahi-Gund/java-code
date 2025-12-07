import java.util.*;
class ProfitLoss
{
	public static void main(String[] args) 
	{
		final double product_value=350;
		double selling_value;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter selling price :");
		selling_value=sc.nextDouble();
		
		String check=(product_value<selling_value) ? ("Profit") :("Loss");
		
		System.out.println(check);
	}
}
