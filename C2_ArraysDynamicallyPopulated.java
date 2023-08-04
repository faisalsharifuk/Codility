package com.faisal.codility;

import java.util.Scanner;

/**
 *
 * @author faisa
 */
public class C2_ArraysDynamicallyPopulated {
    
    public static void main(String[] args) {
   
        Scanner s = new Scanner(System.in);
        int N;
        do {
        System.out.println("Enter the array size between 1 and 100");
        while (!s.hasNextInt()) {
            s.next();
        }
        N = s.nextInt();
        } while (N<1 || N>100);

        int[] arr = new int[N];
       
        System.out.println("Enter the array element");
        
        for (int i=0; i<N; i++) {
            arr[i] = s.nextInt();
        }
        for (int i : arr) {
            System.out.print(i+" ,"); 
        }
    }
}