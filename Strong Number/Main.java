import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int sum=0,a=num,product=1;
      while(a>0)
      {
        for(int b=a%10;b>0;b--)
        {
          product=product*b;
        }
        sum=sum+product;
        product=1;
        a=a/10;
      }
      if(sum==num)
      System.out.println("Yes");
      else
       System.out.println("No"); 
	}
}
