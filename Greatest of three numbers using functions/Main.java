import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int a=greatest_no(n1,n2);
      System.out.println(greatest_no(a,n3));
	}
  public static int greatest_no(int m,int n)
  {
    if(m>=n)
    {
      return m;
    }
    else
      return n;
  }
    
     
}