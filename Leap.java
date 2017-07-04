import java.io.*;
import java.util.*;
public class Leap{
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n%4==0 && n%100!=0)
{
System.out.println("This is leap year");
}
else if(n%100==0)
{
System.out.println("This is not a leap year");
}
else if(n%400==0)
{
System.out.println("This is leap year");
}
else
{
System.out.println("This is not a leap year");
}
}
}
