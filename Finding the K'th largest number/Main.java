import java.util.Scanner;
class Main{
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
      int k=in.nextInt();
      int minidx=0;
      while(minidx<=arr_size)
      {
      for(int idx=minidx+1;idx<arr_size;idx++)
      {
        if(arr[minidx]>arr[idx])
        {
          int temp=arr[idx];
          arr[idx]=arr[minidx];
          arr[minidx]=temp;
        }
      }
        minidx++;
      }
      System.out.println(arr[arr_size-k]);
    }   
}