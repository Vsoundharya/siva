import java.io.*;
import java.util.*;
public class Duplicate{
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);  
    String s1=sc.nextLine();
    String[] str =s1.split("\\s");
    for (int i = 0; i < str.length; i++) {
      for (int j = 0; j < str.length; j++) {
        if (str[i].equals(str[j])) {
          if (i != j) {
            str[i] = "";
          }
        }
      }
    }
    System.out.println("Output after Removing Duplicate String:");
    for (int i = 0; i < str.length; i++) {
     if (str[i] != "") {
        System.out.print(str[i] + " ");  
      }
    }
  }
}

  
  
