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
      int largest_number=0;
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i]>largest_number)
          largest_number=arr[i];
      }
      System.out.println(largest_number);
    }
}