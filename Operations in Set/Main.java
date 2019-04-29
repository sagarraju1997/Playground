import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String args[])throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String num=br.readLine();
      String arr[]=num.split(",");
      LinkedHashSet a=new LinkedHashSet();
      for(int i=0;i<arr.length;i++)
      {
        a.add(arr[i]);
      }
      System.out.println(a);
      String b=br.readLine();
      a.remove(b);
      System.out.println("Enter the value to be deleted: "+b);
      System.out.println(a);
      String c=br.readLine();
      a.add(c);
      System.out.println("Enter the value to be added: "+c);
      System.out.println(a);
    }
}