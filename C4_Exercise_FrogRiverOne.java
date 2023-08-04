package com.faisal.codility;

/**
 *
 * @author faisa
 */
public class C4_Exercise_FrogRiverOne {
    
    public static int solution(int X, int[] A) {
        int result = -1;
        int[] jump = new int[X+1];
        int x = 0;
        
        for (int i=0; i<A.length; i++) {
            if (jump[A[i]]==0) {
                jump[A[i]] = A[i];
                x = x+1;
                if (x==X) {
                    return i;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(solution(5, new int[] {1,3,1,4,2,3,5,4}));
    }
}