import java.io.*;
import java.util.*;
public class Ascii{
  

public static void main(String[] args) {
    for (int c = 0; c < 127; c++) {
    System.out.print((char) c);
    if ((c - 31) % 10 == 0) {
        System.out.println(); 
    }  
  }
}
}
