import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=n%10;
      while(n/10!=0)
      {
        n=n/10;
      }
      int sum=a+n;
      System.out.println(sum);
	}
}