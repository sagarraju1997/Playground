import java.util.Scanner;
class Main
{
  public static int square_number(int a)
  {
    int square=a*a;
    return square;
  }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int square=square_number(num);
      System.out.println(square);
	} 
}