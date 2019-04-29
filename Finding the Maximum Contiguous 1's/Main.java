import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int idx=0;idx<arr_size;idx++)
      {
        arr[idx]=in.nextInt();
      }
      int max=0, count=0;
      for(int idx=0;idx<arr_size;idx++)
      {
        if(arr[idx]==1)
          count++;
        else if(count>max)
        {
          max=count;
          count=0;
        }
        else
        {
          count=0;
        }
      }
      System.out.print(max);
    }
}