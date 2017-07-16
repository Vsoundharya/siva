import java.io.*;
import java.util.*;
public class Fibo1{
  public static void main(String args[]){
    int a=0,b=1,i,count=10,c;
    System.out.println(a);
    System.out.println(b);
    for(i=2;i<count;i++)
    {
      c=a+b;
      System.out.println(c);
      a=b;
      b=c;
      }
      }
      }
