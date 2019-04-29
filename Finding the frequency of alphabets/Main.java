import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int sb_len=sb.length();
      int stat[]=new int[26];
      for(int idx=0;idx<26;idx++)
      {
        stat[idx]=0;
      }
      for(int idx=0;idx<sb_len;idx++)
      {
        if(sb.charAt(idx)>='A' && sb.charAt(idx)<='Z')
        {
          int offset=sb.charAt(idx)-'A';
          char ch=(char)(offset + 'a');
          sb.setCharAt(idx,ch);
        }
        if(sb.charAt(idx)>='a' && sb.charAt(idx)<='z')
        {
          int offset=sb.charAt(idx)-'a';
          stat[offset]++;
        }
      }
      for(int idx=0;idx<sb_len;idx++)
      {
        if(stat[sb.charAt(idx) - 'a']!=0)
        {
          System.out.print(sb.charAt(idx)+""+stat[sb.charAt(idx) - 'a']+" ");
          stat[sb.charAt(idx)-'a']=0;
        }
      }
    }
}