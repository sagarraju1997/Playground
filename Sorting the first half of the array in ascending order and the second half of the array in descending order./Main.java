import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int idx=0;idx<n;idx++)
    {
      arr[idx]=in.nextInt();
    }
    sort_ascending(n,arr);
    sort_descending(n,arr);
    for(int idx=0;idx<n;idx++)
    {
      System.out.print(arr[idx]+" ");
    }
  }
  public static void sort_ascending(int n, int arr[])
  {
    for(int i1=0;i1<(n/2)-1;i1++)
    {
      for(int i2=i1+1;i2<n/2;i2++)
      {
        if(arr[i1]>arr[i2])
        {
          int temp=arr[i1];
          arr[i1]=arr[i2];
          arr[i2]=temp;
        }
      }
    }
  }
  public static void sort_descending(int n, int arr[])
  {
    for(int i1=n/2;i1<n-1;i1++)
    {
      for(int i2=i1+1;i2<n;i2++)
      {
        if(arr[i1]<arr[i2])
        {
          int temp=arr[i1];
          arr[i1]=arr[i2];
          arr[i2]=temp;
        }
      }
    }
  }
}