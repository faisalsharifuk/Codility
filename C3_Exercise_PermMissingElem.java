package com.faisal.codility;

import java.util.Arrays;

/**
 *
 * @author faisa
 */
public class C3_Exercise_PermMissingElem {
    public static int solution(int[] A) {
        
        int missing = 1;
        int result = 1;
  
        Arrays.sort(A);
        
        for (int i = 0; i < A.length; i++) {
        if (A[i] == missing) {    
            missing = A[i]+1; 
        } else {
            return 0;
        }
    }
        return result;
    }
        
       public static void main(String[] args) {
    System.out.println(solution(new int[] {4,1,3}));
}
}

