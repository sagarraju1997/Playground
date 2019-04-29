import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int star_count=1;
      for(int row=1;row<=n;row++)
      {
        for(int space=1;space<=n-row;space++)
        {
          System.out.print(" ");
        }
        for(int stars=1;stars<=star_count;stars++)
        {
         System.out.print("*");
        }
        star_count=star_count+2;
        System.out.print("\n");
      }
	}
}
