import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
		Scanner in = new Scanner(System.in);
		// Type your code here
      int year=in.nextInt();
      int m,n,o;
      m=year%4;
      n=year%100;
      o=year%400;
      if(m==0 && n==0 && o==0)
        System.out.println("Leap year");
      else
        System.out.println("Non Leap year");
    }
}