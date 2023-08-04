package com.faisal.codility;

public class C1_Factorial {     
    public static void main(String[] args) {
        int factorial = 1;
        int n = 5;
        for (int i=1; i<=n; i++) {
            factorial = factorial*i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);  
    }
        
    }
