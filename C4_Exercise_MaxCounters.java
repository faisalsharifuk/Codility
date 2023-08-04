package com.faisal.codility;

/**
 *
 * @author faisa
 */
public class C4_Exercise_MaxCounters {
    
    public static int[] solution(int N, int[] A) {
    
        int counter[] = new int[N];
        int max = -1;
        int current_min = 0;

        for(int i=0; i<A.length; i++){
            if(A[i] >= 1 && A[i] <= N){
                if(counter[A[i] - 1] < current_min) {
                    counter[A[i] - 1] = current_min;
                }
                counter[A[i] - 1] = counter[A[i] - 1] + 1;
                
                if(counter[A[i] - 1] > max) {
                    max = counter[A[i] - 1];
                }
            }
            else if (A[i] == N+1) {
                current_min = max;
            }
        }
        
        for(int i=0;i<N;i++){
            if(counter[i] < current_min) {
                counter[i] =  current_min;
            }
    }    
        for (int c : counter) {
        System.out.print(c + ",");
        } 
        return counter;
    }
    public static void main(String[] args) {
        System.out.println(solution(5, new int[] {3,4,4,6,1,4,4}));
    }

}
