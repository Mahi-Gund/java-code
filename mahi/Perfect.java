import java.util.Scanner;
public class Perfect {
    public static void main(String args[])
    {
        int num=0,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number :");
      int a=sc.nextInt();
      
      for (i=1;i<a;i++)
      {
          if (a%i==0)
          {
              num=num+i;
          }
      }
      if(num==a)
      {
          System.out.println("Perfect no.");
      }
      else{
          System.out.println("Not");
      }
    }
    
}
