import java.io.*;
import java.util.*;
public class Lcm{
  public static void main(String args[]){
    int a,t,l;
    int b;
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    a=x;
    b=y;
    while(b != 0)
    {
      t = b;
      b = a%b;
      a = t;
    } 
    l = (x*y)/a; 
    System.out.print(l);
  }
  }

