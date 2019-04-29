import java.util.*;
class Main
{
	public static void main (String[] args)
    {
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int num_digit=0;
      int a=num,c=num;
      int sum=0,b;
      while(a>0)
      {
        a=a/10;
        num_digit++;
      }
      while(num>0)
      {
        b=num%10;
        num=num/10;
        sum=sum+ power(b,num_digit);
      }
      if(sum==c)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
    }
  public static int power(int base, int pow)
  {
    int powe=1;
    for(int i=0;i<pow;i++)
    {
      powe=powe*base;
    }
    return powe;
  }
}
