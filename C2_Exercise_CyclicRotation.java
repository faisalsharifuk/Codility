package com.faisal.codility;

/**
 *
 * @author faisa
 */
public class C2_Exercise_CyclicRotation {
 
    public static int[] solution(int[] A, int K) {
        if (A.length == 0 || A.length == K || K == 0) return A;
        for (int i=0; i<K; i++) {
            int j, last;
            last = A[A.length-1];
            for (j = A.length-1; j>0; j--) {
                A[j] = A[j-1];
            }
            A[0] = last;
        }
        return A;
    }
    
    public static void main(String[] args) {
    for (int arr : solution(new int[] { 9, 3, 9, 3, 9, 7, 9 },2)) {
            System.out.print(arr + " ");
}
}
}
