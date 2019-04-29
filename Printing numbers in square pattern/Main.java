import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int count_row=1;count_row<=n;count_row++)
      {
        for(int count_col=1;count_col<=n;count_col++)
        {
          System.out.print(count_row);
        }
        System.out.print("\n");
      }
    }
}