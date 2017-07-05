import java.io.*;
import java.util.*;
public class Prime1{
  public static void main(String args[]) throws IOException{
    int i,j,flag=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a=Integer.parseInt(br.readLine());
    int b=Integer.parseInt(br.readLine());
    for(i=a;i<b;i++)
    {
      for(j=2;j<i;j++)
      
      {
        if(i%j==0)
        {
          
          flag=0;
          break;
        }
        else
        flag=1;
      }
      
      if(flag==1)
      {
        System.out.println(i);
      }
    }
  }
}
