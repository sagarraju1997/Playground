import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in=new Scanner(System.in);
      int base=in.nextInt();
      int exponent=in.nextInt();
      int result=1;
      while(exponent!=0)
      {
        result*=base;
        exponent--;
      }
      System.out.println(result);
    }
}