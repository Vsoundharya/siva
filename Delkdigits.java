import java.io.*;
import java.util.*;
public class Delkdigits{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int n=sc.nextInt();
    String[] str=s.split(" ");
    Arrays.sort(str);
    s=Arrays.toString(str);
    s=s.replaceAll("\\[","").replaceAll("\\]","").replaceAll("\\s","").replaceAll(",","");
    System.out.println(s.substring(0, str.length-n));
    }
    }
  
