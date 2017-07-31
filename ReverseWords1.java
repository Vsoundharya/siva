import java.io.*;
import java.util.*;
public class ReverseWords1{
 	public static void main(String[] args)
 	{
    Scanner sc=new Scanner(System.in);   
    		String s=sc.nextLine();
 		 String[] s1=s.split(" ");
 		 String[] s2=new String[s1.length];
 		 for(int i=0,j=s1.length-1;i<s1.length&&j>=0;i++,j--)
     {
  			 s2[i]=s1[j];
         }
         for(int i=0;i<s2.length;i++)
 		 {
  			 System.out.print(s2[i]+" ");
 		 }
     }
     }
