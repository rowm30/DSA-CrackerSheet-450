package DP;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n){
        int[] a = new int[n+2];
        a[0]= 0;
        a[1]= 1;
        for (int i = 2; i <= n; i++) {
            a[i] = a[i-1] + a[i-2];
        }
        return a[n];
    }
}
