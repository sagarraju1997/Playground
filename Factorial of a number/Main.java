import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int product=1;
      for(int a=num;a>0;a--)
      {
        product=product*a;
      }
      System.out.println(product);
	}
}
