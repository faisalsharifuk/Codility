package com.faisal.codility;
import java.util.Scanner;
/**
 *
 * @author faisa
 */
public class C1_TriangleReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = s.nextInt();
        
             // loop to iterate for the given number of rows
        for (int i = 1; i<=rows; i++) {
            
            
               // loop to print the number of spaces before the star
            for (int j = rows; j >= i; j--) {
                 System.out.print(" ");
            }

            // loop to print the number of stars in each row
            for (int j = rows; j>=i; j--) {
                System.out.print("* ");
            }
            
              // for new line after printing each row
            System.out.println("");
        }
    }
} 
