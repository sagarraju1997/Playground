import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      int str_len=str.length();
      boolean is_palindrome=true;
      for(int idx=0;idx<=str_len/2;idx++)
      {
        if(str.charAt(idx)!=str.charAt(str_len-idx-1))
           {
             is_palindrome=false;
           }
      }
      if(is_palindrome==true)
        System.out.print("Yes");
      else
        System.out.print("No");
    } 
}
