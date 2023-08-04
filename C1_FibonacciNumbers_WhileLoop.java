package com.faisal.codility;

/**
 *
 * @author faisa
 */
public class C1_FibonacciNumbers_WhileLoop {
    public static void main(String[] args) {
        int a, b = 0;
        int c = 1;
        
        while (c<=10) {
            a=b;
            b=c;
            c=a+b;
            System.out.println(c);
        }
    }
}
