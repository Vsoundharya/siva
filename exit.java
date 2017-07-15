import java.util.*;
import java.io.* ;
public class exit{
  public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    if(ch=='q' ||ch=='Q')
    {
      System.exit(0); 
    }
    else
    {
      System.out.println("The character is:"+ch);
    }
    }
  }
  
