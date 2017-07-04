import java.io.*;
import java.util.*;
public class Natu{
public static void main(String args[]){
int a,i=1;
int sum=0;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
while(i<=a)
{
sum=sum+i;
i++;
}
System.out.println("sum of "+a+" number is:"+sum);
}
}

