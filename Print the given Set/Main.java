import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String args[])throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String m=br.readLine();
      String arr[]=m.split(",");
      LinkedHashSet<String> a=new LinkedHashSet<String>();
      for(int i=0;i<arr.length;i++)
      {
        a.add(arr[i]);
      }
      System.out.println(a);
      
      
    }
}