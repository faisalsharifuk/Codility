package com.faisal.codility;

import java.util.*;

/**
 *
 * @author faisa
 */
public class C2_ArrayReversing {
    
    static void reverse(Integer a[]) {
        Collections.reverse(Arrays.asList(a));
        System.out.println("Reverse List: " + Arrays.asList(a));
    }
    
    public static void main(String[] args) {
        Integer[] num = {5, 6, 7, 8};
        System.out.print("Original List: [");
        for (Integer x : num) {
            System.out.print(x + ", ");
        }
        System.out.println("]");
       reverse(num);
}
}

