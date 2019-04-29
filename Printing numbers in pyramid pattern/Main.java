import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
    	// Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int count=0;
      for(int row=1;row<=num;row++)
      {
        for(int space=0;space<num-row;space++)
        {
          System.out.print(" ");
        }
        for(int col=1;col<=row;col++)
        {
          count++;
          System.out.print(count+" ");
        }
        System.out.println();
      }
    }    
}