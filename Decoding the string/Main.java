import java.util.Scanner;
class Main
{
  public static void main(String args[]) 
  {
    // Type your code here
    Scanner in=new Scanner(System.in);
    String text=in.nextLine();
    StringBuilder str=new StringBuilder(text);
    int str_len=str.length();
    int key=in.nextInt();
    for(int i=0;i<str_len;i++)
    {
      if(str.charAt(i)!=' ')
      {
      int ch=str.charAt(i)-key;
      if(str.charAt(i)>'A' && str.charAt(i)<'Z')
      {
        if(ch<'A')
        {
          ch=ch+26;
        }
      }
      else if(str.charAt(i)>'a' && str.charAt(i)<'z')
      {
        if(ch<'a')
        {
          ch=ch+26;
        }
      }
      str.setCharAt(i,(char)ch);
      }
    }
    System.out.print(str);
  }
}