import java.util.Scanner;
class Main
{
  public static int sum_numbers(int a)
  {
    int sum=0;
    while(a!=0)
    {
      sum=sum+a;
      a--;
    }
    return sum;
  }
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int sum=sum_numbers(num);
      System.out.println(sum);
	}
}