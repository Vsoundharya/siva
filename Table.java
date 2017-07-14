import java.io.*;
import java.util.*;
public class Table{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=10;i++)
    {
      int a=i*n;
      System.out.println(i+"*"+n+"="+a);
    }
  }
}
