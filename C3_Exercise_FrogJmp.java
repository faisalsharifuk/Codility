package com.faisal.codility;

/**
 *
 * @author faisa
 */
public class C3_Exercise_FrogJmp {
    public static int solution(int X, int Y, int D) {
        //my loop solution as below, failed the Codility performance tests
//        int result = 0;
//        int count = 0;
//        while (X<=Y && result<=Y) {
//            result = result + (X + D);
//            count++;
//        }
//        return count;

        //optimal solution, passed the Codility performance tests
        int distance = Y-X;
        
        if (distance == 0) {
            return 0;
        } else {
        int jumpCount = distance / D;
        int modValue = distance % D;
        
        if (modValue > 0) {
            jumpCount++;
        }
        return jumpCount;
    }
    }       
    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
    }
}