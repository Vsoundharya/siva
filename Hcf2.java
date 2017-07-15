# siva
import java.io.*;
  import java.util.*;
  public class Hcf2{
    
    public static void main(String args[])
    {
    int hcf=0;
    
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int min=Math.min(a,b);
     for(int i=min;i>=1;i--)
     {  
       if(a%1==0 && b%2==0)
       {
         hcf=i;
         break;
         }  }
        
           System.out.println(hcf);
           }
           }


