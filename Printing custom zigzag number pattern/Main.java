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
        if(row%2==1)
        {
          for(int col=1;col<=n;col++)
          {
            if(col==n)
              System.out.print(row+1);
            else
              System.out.print(row);
          }
        }
        else
        {
          for(int col=1;col<=n;col++)
          {
            if(col==1)
              System.out.print(row+1);
            else
              System.out.print(row);
          }
        }
          System.out.print("\n");
      }
	}
}