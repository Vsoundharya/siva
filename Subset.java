import java.io.*;
import java.util.*;
public class Subset{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str;
    String s1=sc.nextLine();
    System.out.println("Enter input length");
    int n=sc.nextInt();
    int j=1;
    for(int i=0;i<=s1.length()-n;i++){
      str=s1.substring(0,1)+s1.substring(j,j+n-1);
      j++;
      System.out.println(str);
    }  
  }
}
