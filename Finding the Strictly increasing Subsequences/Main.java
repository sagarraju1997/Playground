import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int idx=0;idx<n;idx++)
    {
      arr[idx]=in.nextInt();
    }
    for(int idx1=0;idx1<n;idx1++)
    {
      int hold=0;
      for(int idx2=idx1+1;idx2<n;idx2++)
      {
        if(arr[idx2]>arr[idx1])
        {
          if(arr[idx2]>hold || hold==0)
          {
            hold=arr[idx2];
            System.out.println(arr[idx1]+","+arr[idx2]);
          }
        }
      }
    }
  }
}