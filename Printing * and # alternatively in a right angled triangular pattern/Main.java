import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=0;
      for(int count_row=1;count_row<=n;count_row++)
      {
        for(int count_col=1;count_col<=count_row;count_col++)
        {
          count++;
          if(count%2!=0)
          {
          System.out.print("*");
          }
          else
          {
            System.out.print("#");
          }
        }
        System.out.print("\n");
      }
	}
}