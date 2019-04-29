import java.util.Scanner;
class Main
{
  public static void main(String args[]) 
  {
    // Type your code here
    Scanner in=new Scanner(System.in);
    String str1=in.nextLine();
    String str2=in.nextLine();
    int str1_len=str1.length();
    int str2_len=str2.length();
    int count=0;
    for(int idx1=0;idx1<=(str1_len-str2_len);idx1++)
    {
      boolean is_matching=true;
      for(int idx2=0;idx2<str2_len;idx2++)
      {
        if(str2.charAt(idx2)!=str1.charAt(idx1+idx2))
        {
          is_matching=false;
        }
      }
      if(is_matching==true)
      {
        count++;
      }
    }
    System.out.print(count);
  } 
}
