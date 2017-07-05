import java.io.*;
import java.util.*;
public class Prime{
public static void main(String args[]) throws IOException{
int i,m=0,flag=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
for(i=2;i<=m;i++)
{
if(n%i==0)
{
System.out.println("Number is not a prime");
flag=1;
break;
}
}

if(flag==0)
{
System.out.println("Number is prime");
}
}
}
