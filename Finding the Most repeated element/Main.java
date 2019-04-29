import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int arr_size=in.nextInt();
    int arr[]=new int[arr_size];
    for(int idx=0;idx<arr_size;idx++)
    {
      arr[idx]=in.nextInt();
    }
    int count[]=new int[10];
    for(int idx=0;idx<arr_size;idx++)
    {
      count[arr[idx]]++;
    }
    int max_idx=arr[0];
    for(int idx=0;idx<10;idx++)
    {
      if(count[idx]>count[max_idx])
      {
        max_idx=idx;
      }
    }
    System.out.print(max_idx);
  }
}