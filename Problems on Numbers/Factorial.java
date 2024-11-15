// Write a Java program to find the factorial of a number using recursion.

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number for Factorial : ");
    int num = sc.nextInt() ;
    int temp = num ;
    int result = 1 ;
    while (temp != 0) {
      result = result * temp ;
      temp = temp - 1 ;
    }
    
    System.out.println("The Factorial of " + num + " is : " + result);
  }
}
