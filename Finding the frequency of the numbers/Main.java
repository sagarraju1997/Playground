import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      int arr[]=new int[n];
      for(int idx=0;idx<n;idx++)
      {
        arr[idx]=in.nextInt();
      }
      int count[]=new int[k+1];
      for(int idx=1;idx<=k;idx++)
      {
        count[idx]=0;
      }
      for(int idx=0;idx<n;idx++)
      {
        count[arr[idx]]++;
      }
      for(int idx=1;idx<=k;idx++)
      {
        System.out.println(idx+" "+count[idx]);
      }
    }
}