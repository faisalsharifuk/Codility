package com.faisal.codility;

import java.util.Arrays;

/**
 *
 * @author faisa
 */
public class C4_Exercise_PermCheck {
    
    public static int solution(int[] A) {
        int missing = 1;
        Arrays.sort(A);
        
        for (int i=0; i<A.length; i++) {
            if (A[i] == missing) {
                missing = A[i]+1;
            }
        }
        return missing;
    }
    public static void main(String[] args) {
         System.out.println(solution(new int[] {2,3,1,5}));
    }
}