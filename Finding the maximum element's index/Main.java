import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    int lar_num_idx=0,lar_num=0;
    for(int idx=0;idx<n;idx++)
    {
      list[idx]=in.nextInt();
    }
    for(int idx=0;idx<n;idx++)
    {
      if(list[idx]>=lar_num)
      {
        lar_num_idx=idx;
        lar_num=list[idx];
      }
    }
    System.out.print(lar_num_idx);
  }
}