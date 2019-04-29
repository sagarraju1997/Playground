import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    int str_len=str.length();
    for(int idx=0;idx<str_len;idx++)
    {
      if(!check_vowel(str.charAt(idx)))
      {
        System.out.print(str.charAt(idx));
      }
    }
  }
    public static boolean check_vowel(char ch)
    {
      String st="aeiouAEIOU";
      for(int idx=0;idx<10;idx++)
      {
        if(ch==st.charAt(idx))
        {
          return true;
        }
      }
      return false;
    }
}