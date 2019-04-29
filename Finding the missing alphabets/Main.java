import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      int str_len=str.length();
      int stat[]=new int[26];
      for(int idx=0;idx<26;idx++)
      {
        stat[idx]=0;
      }
      for(int idx=0;idx<str_len;idx++)
      {
        if(str.charAt(idx)>='a' && str.charAt(idx)<='z')
        {
          int offset=str.charAt(idx)-'a';
          stat[offset]++;
        }
        else if(str.charAt(idx)>='A' && str.charAt(idx)<='Z')
        {
          int offset=str.charAt(idx)-'A';
          stat[offset]++;
        }
      }
      for(int idx=0;idx<26;idx++)
      {
        if(stat[idx]==0)
        {
          char ch=(char)(idx+97);
          System.out.print(ch+" ");
        }
      }
    }
}