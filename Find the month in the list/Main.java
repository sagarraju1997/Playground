import java.util.*;
import java.io.*;
import java.lang.*;
class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      String month=br.readLine();
      String arr[]=month.split(",");
      LinkedList<String> ll=new LinkedList<String>();
      for(int i=0;i<arr.length;i++)
      {
        ll.add(arr[i]);
      }
      System.out.println(ll);
      System.out.println("Size of the linked list: "+ll.size());
      System.out.println("Is LinkedList empty? "+ll.isEmpty());
      String m=br.readLine();
      System.out.println("Does LinkedList contains "+m+"?");
      System.out.println(ll.contains(m));
    }
}