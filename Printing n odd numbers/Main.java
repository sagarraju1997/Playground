import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i=1;
      for(int count=1; count<=n; count++)
      {
        System.out.println(i);
        i=i+2;
      }
	}
}