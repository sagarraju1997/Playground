import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    int str_len=str.length();
    integer(str,str_len);
  }
  public static void integer(String str, int str_len)
  {
    int n=0;
    int num=0;
    if(str.charAt(0)==45)
    {
      n=1;
    }
    for(int idx=n;idx<str_len;idx++)
    {
      num=num*10+(str.charAt(idx)-'0');
    }
    if(n==1)
    {
      System.out.print(-1*num);
    }
    else
      System.out.print(num);
  }
}