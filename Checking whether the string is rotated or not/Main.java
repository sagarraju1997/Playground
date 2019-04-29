import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in=new Scanner(System.in);
      String str1=in.nextLine();
      String str2=in.nextLine();
      String temp=(str1.concat(str1));
      int temp_len=temp.length();
      int str2_len=str2.length();
      boolean is_matching=false;
      for(int idx1=0;idx1<=temp_len-str2_len;idx1++)
      {
          if(str2.equals(temp.substring(idx1,idx1+str2_len))==true)
          {
             is_matching=true;
          }
      }
      if(is_matching==true)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}