import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      switch(num)
      {
        case 1:
          int side=in.nextInt();
          System.out.print(side*side);
          break;
        case 2:
          int length=in.nextInt();
          int breadth=in.nextInt();
          System.out.print(length*breadth);
          break;
        case 3:
          int base=in.nextInt();
          int height=in.nextInt();
          System.out.print(0.5*base*height);
          break;
        case 4:
          int radius=in.nextInt();
          System.out.print(3.14*radius*radius);
      }
    }
}