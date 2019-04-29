import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int idx=0;idx<arr_size;idx++)
      {
        arr[idx]=in.nextInt();
      }
      int is_matched=1;
      for(int idx=0;idx<=arr_size/2;idx++)
      {
        if(arr[idx]!=arr[arr_size-idx-1])
        {
          is_matched=0;
          break;
        }
      }
      if(is_matched==0)
      {
        System.out.print("No");
      }
      else
        System.out.print("Yes");
    }
}