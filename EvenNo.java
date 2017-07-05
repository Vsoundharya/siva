# siva

import java.io.*;
import java.util.*;
public class EvenNo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the starting number");
int a=sc.nextInt();
System.out.println("Enter the ending numbers");
int b=sc.nextInt();
for(int i=a;i<b;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}
