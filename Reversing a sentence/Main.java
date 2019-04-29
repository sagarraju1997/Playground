import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int str_len=sb.length();
      reverse_string(sb,0,str_len-1);
      int start_end=0;
      for(int idx=0;idx<str_len;idx++)
      {
        if(sb.charAt(idx)==' ')
        {
          reverse_string(sb,start_end,idx-1);
          start_end=idx+1;
        }
        else if(idx==str_len-1)
        {
          reverse_string(sb,start_end,idx);
        }
      }
      System.out.print(sb);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      int end = end_idx;
        int front = start_idx;
        while(front < end)
        {
            char tmp_ch = sb.charAt(front);
            sb.setCharAt(front, sb.charAt(end));
            sb.setCharAt(end, tmp_ch);
            front++;
            end--;
        }
    }
}