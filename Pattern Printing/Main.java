import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in=new Scanner(System.in);
      int row=in.nextInt();
      int column=in.nextInt();
      for(int r=row;r>0;r--)
      {
        for(int c1=column;c1>=r;c1--)
        {
          System.out.print(c1);
        }
        for(int c2=r-1;c2>0;c2--)
        {
          System.out.print(r);
        }
        System.out.println();
      }
    }
}