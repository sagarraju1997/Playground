import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    int str_len=str.length();
    for(int row=1;row<=str_len;row++)
    {
      int mid=(str_len/2);
      for(int space=1;space<=str_len-row;space++)
      {
        System.out.print(" ");
      }
      for(int col=1;col<=row;col++)
      {
        if(mid!=str_len)
        {
          System.out.print(str.charAt(mid));
          mid++;
        }
        else
        {
          mid=0;
          System.out.print(str.charAt(mid));
          mid++;
        }
      }
      System.out.print("\n");
    }
  }
}