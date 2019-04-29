import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int prime=2;prime<=n;prime++)
      {
        is_prime(prime);
        if(is_prime(prime)==0)
        {
          System.out.println(prime);
        }
      }
	}
  public static int is_prime(int a)
  {
    int check=0;
    for(int b=2;b<=a/2;b++)
    {
      if(a%b==0)
      {
        check=1;
        break;
      }
    }
    return check;
  }    
}