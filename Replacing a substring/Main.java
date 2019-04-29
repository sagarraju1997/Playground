import java.util.Scanner;
class Main
{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      String replace=in.nextLine();
      String include=in.nextLine();
      System.out.print(str.replace(replace,include));
    }
}