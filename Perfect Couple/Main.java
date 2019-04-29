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
      int value=in.nextInt();
      for(int idx1=0;idx1<arr_size;idx1++)
      {
        for(int idx2=idx1;idx2<arr_size;idx2++)
        {
          if(arr[idx1]+arr[idx2]==value)
          {
            System.out.println(arr[idx1]+","+" "+arr[idx2]);
          }
        }
      }
    }
}