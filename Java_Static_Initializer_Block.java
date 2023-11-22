import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

// Write your code here
 private static int B;
 private static int H;
 private static boolean flag;
 
 static{
     Scanner scan  = new Scanner(System.in);
     B = scan.nextInt();
     H = scan.nextInt();
     scan.close();
    /* 
    We can use this method also [Hari :)]
    if(B <= 0 || H <= 0)
     {
         System.out.println("java.lang.Exception: Breadth and height must be positive");
         flag = false;
     }
     else{
         flag = true;
     }
     */
     if(B > 0 && H > 0)
     {
         flag = true;
     }
     else
     {
         System.out.println("java.lang.Exception: Breadth and height must be positive");
         flag = false;
     }
 }
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

