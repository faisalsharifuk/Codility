package com.faisal.codility;

import java.util.Scanner;

/**
 *
 * @author faisa
 */
public class C1_BinaryConversion {
    
    static void binary(int num) {
        System.out.println("The binary number is: " + Integer.toString(num, 2));
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer");
        int x = s.nextInt();
        binary(x);
        
    }
}
