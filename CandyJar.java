/*
* Description: A Java program that calculates candies in a candy jar given amount sold
*/

import java.util.Scanner;
public class CandyJar{    
     public static void main(String []args){
       int n = 10, k = 5;
       int num;
       Scanner sc = new Scanner(System.in);
       num = sc.nextInt();
       if(num >= 1 && num <= 5) {
          System.out.println("Number of candies sold: " + num);
          System.out.print("Number of candies left: " + (n - num));
       } else {
          System.out.println("Invalid input");
          System.out.print("Number of candies left: " + n);
}
}
}
