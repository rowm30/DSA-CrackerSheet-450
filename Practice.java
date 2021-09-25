

import java.util.Scanner;

public class Q1_Recursive
 {

    static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return (s * s == x);
    }

    
    static boolean isFibonacci(int n) {
        
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            System.out.println(isFibonacci(p) ? "TRUE" : "FALSE");
        }
    }
}
