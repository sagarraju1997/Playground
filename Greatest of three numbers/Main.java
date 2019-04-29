import java.util.Scanner;
class Main 
{
	public static void main (String[] args) 
    {
		// Type your code here
      
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int largest_num=0;
      if(n1>n2)
        largest_num=n1;
      else
        largest_num=n2;
      if(largest_num<n3)
        largest_num=n3;
      System.out.println(largest_num);
    }
}