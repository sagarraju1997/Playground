import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner in=new Scanner(System.in);
      String str1=in.nextLine();
      String str2=in.nextLine();
      int part=in.nextInt();
      String arr[]=str2.split(" ",part);
      for(int i=0;i<part;i++)
      {
        System.out.println(arr[i]);
      }
    }
}