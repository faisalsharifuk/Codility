package com.faisal.codility;

import java.util.stream.*;

/**
 *
 * @author faisa
 */
public class C4_SwapTheElements {
    
    public static int solution(int[] A, int[] B) {
        int N = A.length;
        int sum_a = IntStream.of(A).sum();
        int sum_b = IntStream.of(A).sum();

       for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                int diff = B[j] - A[i];
                sum_a = sum_a + diff;
                sum_b = sum_b - diff;
                
                if (sum_a == sum_b) {
                    return 1;
                } 
                else {
                    sum_a = sum_a - diff;
                    sum_b = sum_b + diff;
                }
                return 0;
            }
        }
          return sum_a;
    }
    
    public static void main(String[] args) {
        System.out.println(solution(new int[] { 3,1,2,2,5 }, new int[] { 3,4,2,1,3 } ));
    }
}   
