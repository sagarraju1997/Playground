import java.util.Scanner;
public class Main
{
    public static void main(String args[]) 
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      char ch=in.next().charAt(0);
      int key=in.nextInt();
      ch=(char)(ch-key);
      if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        System.out.print(ch);
      else
      {
        ch=(char)(ch+26);
        System.out.print(ch);
      }
    }
}