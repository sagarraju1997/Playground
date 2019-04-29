import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in=new Scanner(System.in);
    int arr_size=in.nextInt();
    int arr[]=new int[arr_size];
    for(int idx=0;idx<arr_size;idx++)
    {
      arr[idx]=in.nextInt();
    }
    int no_of_rotation=in.nextInt();
    right_rotation(arr_size,arr,no_of_rotation);
    left_rotation(arr_size,arr,no_of_rotation);
    for(int idx=0;idx<arr_size;idx++)
    {
      System.out.print(arr[idx]+" ");
    }
  	}
  public static void right_rotation(int arr_size,int arr[],int no_of_rotation)
  {
    int first_odd_element_idx=0;
    int last_odd_element_idx;
    if(arr_size%2==0)
    {
      last_odd_element_idx=arr_size-2;
    }
    else
      last_odd_element_idx=arr_size-1;
    for(int rotation=1;rotation<=no_of_rotation;rotation++)
    {
      int hold=arr[last_odd_element_idx];
      for(int idx=last_odd_element_idx;idx>1;idx=idx-2)
      {
        arr[idx]=arr[idx-2];
      }
      arr[0]=hold;
    }
  }
  public static void left_rotation(int arr_size,int arr[],int no_of_rotation)
  {
    int first_even_element_idx=1;
    int last_even_element_idx;
    if(arr_size%2==1)
    {
      last_even_element_idx=arr_size-2;
    }
    else
      last_even_element_idx=arr_size-1;
    for(int rotation=1;rotation<=no_of_rotation;rotation++)
    {
      int hold=arr[1];
      for(int idx=1;idx<last_even_element_idx;idx=idx+2)
      {
        arr[idx]=arr[idx+2];
      }
      arr[last_even_element_idx]=hold;
    }
  }
}