import java.io.*;
import java.util.*;
public class Rev{
  public static void main(String args[]){
    int n,x;
    int a=0;  
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
      while(n>0)
      {
       x=n%10;
        a=a*10+x;
        n=n/10;
        }
        System.out.println(a);
        }
        }

      
