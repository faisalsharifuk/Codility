package com.faisal.codility;

import java.util.Arrays;

/**
 *
 * @author faisa
 */
public class C4_Exercise_MissingInteger {
     public static int solution(int[] A) {
         int missing = 1;
         Arrays.sort(A);
         
         for (int i=0; i<A.length; i++) {
             if (A[i] == missing) {
             missing = A[i] + 1;
            } else if (A[i] < 0) {
                 missing = 1; 
            }
            else {
                A[i] = A[i] + 1;
            }
        }
         return missing;
     }
     public static void main(String[] args) {
        System.out.println(solution(new int[] {-1,-3}));
    }
}
     
