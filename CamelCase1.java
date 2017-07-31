import java.io.*;
import java.util.*;
public class CamelCase1{
public static void main(String args[]){
String str="MahendraSinghDhoni";
String res="";
for(int i=0;i<str.length();i++)
{
Character ch=str.charAt(i);
if(Character.isUpperCase(ch))
{
res+=" "+Character.toUpperCase(ch);
}
else
{
res+=ch;
}
}
System.out.println(res);
}
}
