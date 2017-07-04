import java.io.*;
import java.util.*;
public class Alpha{
  public static void main(String args[]){
    int i=0;
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    if((ch>='a'&&ch<='z')||(ch=='A'&&ch=='Z'))
    {
      System.out.println("character is alphabet");
    }
    else
    {
      System.out.println("character is not an alphabet");
    }
  }
}
