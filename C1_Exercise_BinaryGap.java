package com.faisal.codility;

import java.util.Scanner;

/**
 *
 * @author faisa
 */
public class C1_Exercise_BinaryGap {
    
  public static int solution(int N) {
    
    System.out.println("The binary number is: " + Integer.toString(N, 2));
      
    int binaryGap = 0;
    boolean found_one = false;

    for (int j = 0; N > 0; N /= 2) {
        if (N % 2 == 0) {
            j++;
        } else {
            if (j > binaryGap && found_one == true){
                binaryGap = j;
            }
            found_one = true;
            j = 0;
        }
    }
    System.out.println("The largest binary gap is: " + binaryGap);
    return binaryGap;
}
  
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer");
        int x = s.nextInt();
        solution(x);
    }
}