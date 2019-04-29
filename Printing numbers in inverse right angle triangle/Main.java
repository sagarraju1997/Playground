import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int row=1;row<=n;row++)
      {
        int a=n-row+1;
        for(int col=1;col<=n-row+1;col++)
        {
          System.out.print(a);
          a=a-1;
        }
        System.out.print("\n");
      }
	}
}