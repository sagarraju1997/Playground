import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int idx=0;idx<n;idx++)
      {
        arr[idx]=in.nextInt();
      }
      for(int num=1;num<=n;num++)
      {
        int is_matched=0;
       for(int idx=0;idx<n;idx++)
       {
         if(num==arr[idx])
         {
           is_matched=1;
           break;
         }
       }
        if(is_matched==0)
        {
          System.out.print(num);
          break;
        }
      }
    }
}