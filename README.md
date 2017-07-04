# siva
import java.io.*;
import java.util.*;
public class Abc{
public static void main(String args[]){
int i=0;
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
System.out.println("character is vowel");
}
else
{
System.out.println("character is consonant");
}
}
}
