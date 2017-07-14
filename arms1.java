import java.util.*;
import java.io.*;
public class Armstrong{  
  public static void main(String[] args)  {  
    Scanner sc=new Scanner(System.in);  
    int num1, num2, i, n, rem, temp, count=0; 
    System.out.println("Enter the starting number");
    num1=sc.nextInt(); 
    System.out.println("Enter the ending number");
    num2=sc.nextInt();  
    for(i=num1+1; i<num2; i++)
    {
      temp = i;
      n = 0;
      while(temp != 0)
      {
        rem = temp%10;
        n = n + rem*rem*rem;
        temp = temp/10;
      }
      if(i == n)
      {
          System.out.println(i);
          }
          }
          }
          }
