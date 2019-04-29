import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int a=n1/100;
    int b=n1/10%10;
    int c=n1%10;
    int reverse=c*100+b*10+a;
    System.out.println(reverse);
  }
}