package com.faisal.codility;

/**
 *
 * @author faisa
 */
public class C2_Exercise_OddOccurrencesInArray {
    public static int solution(int[] A) {
         int elem = 0;

		for (int i = 0; i < A.length; i++) {
			elem ^= A[i];
		}
		return elem;
    }
    public static void main(String[] args) {
    System.out.println(solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));
}
}
