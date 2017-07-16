import java.io.*;
import java.util.*;
public class Words{
  public static void main(String args[]){
    String s1="Mahendra Singh Dhoni";
    int count=0;
    char ch[]=new char[s1.length()];
    for(int i=0;i<s1.length();i++)
    {
      ch[i]=s1.charAt(i);
      if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
      count++;
    }
    System.out.println(count);
    
    
  }
}
