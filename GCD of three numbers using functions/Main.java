import java.util.Scanner;
public class Main
{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int a=gcd(n1,n2);
      System.out.println(gcd(a,n3));
	}
  public static int gcd(int m,int n)
  {
    int min;
    if(m<n)
      min=m;
    else
      min=n;
    while(min>=1)
    {
      if(m%min==0 && n%min==0)
        return min;
      else
        min--;
    }
    return min;
  }
      
}