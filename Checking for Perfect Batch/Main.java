import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    int sum[]=new int[n/3];
    int sum_idx=0;
    boolean is_batch=true;
    for(int idx=0;idx<n;idx++)
    {
      list[idx]=in.nextInt();
    }
    sum[sum_idx]=list[0]+list[1]+list[2];
    for(int idx=3;idx<n;idx=idx+3)
    {
      sum_idx++;
      sum[sum_idx]=list[idx]+list[idx+1]+list[idx+2];
      if(sum[sum_idx]!=sum[sum_idx-1])
      {
        is_batch=false;
      }
    }
    if(is_batch==true)
    {
      System.out.print("Perfect Batch");
    }
    else
      System.out.print("Not a Perfect Batch");
  }
}