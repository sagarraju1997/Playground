import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int idx=0;idx<n;idx++)
    {
      arr[idx]=in.nextInt();
    }
    for(int idx1=0;idx1<(n/2)-1;idx1++)
    {
      for(int idx2=idx1+1;idx2<n/2;idx2++)
      {
        if(arr[idx1]>arr[idx2])
        {
          int temp=arr[idx1];
          arr[idx1]=arr[idx2];
          arr[idx2]=temp;
        }
      }
    }
    for(int idx=0;idx<n;idx++)
    {
      System.out.print(arr[idx]+" ");
    }
  }
}