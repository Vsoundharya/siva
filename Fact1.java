import java.io.*;
import java.util.*;
public class Fact1{
public static void main(String args[]){
int i,fact=1;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}
