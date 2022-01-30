package DP;

// 0-1 KnapSack

public class Q2 {
    
    static int max(int a, int b){
        return (a > b) ? a : b;
    }

    static int KS(int w, int wt[], int val[], int n){
        // Base Condition

        if(n == 0 || w == 0){
            return 0;
        }

        if (wt[n - 1] > w){
            return KS(w, wt , val, n-1);
        }else{
            return max((val[n - 1] + KS(w - wt[n - 1], wt, val, n - 1)), (KS(w, wt, val, n - 1)));
        }
    }

    // Driver Code
    public static void main(String[] args){
        int val[] = new int[] {60, 100, 120};
        int wt[] = new int[] {10, 20, 30};
        int w = 50;
        int n = val.length;
        System.out.println(KS(w, wt, val, n));
    }

}
package DP;

// 0-1 KnapSack

public class Q2 {
    
    static int max(int a, int b){
        return (a > b) ? a : b;
    }

    static int KS(int w, int wt[], int val[], int n){
        // Base Condition

        if(n == 0 || w == 0){
            return 0;
        }

        if (wt[n - 1] > w){
            return KS(w, wt , val, n-1);
        }else{
            return max((val[n - 1] + KS(w - wt[n - 1], wt, val, n - 1)), (KS(w, wt, val, n - 1)));
        }
    }

    // Driver Code
    public static void main(String[] args){
        int val[] = new int[] {60, 100, 120};
        int wt[] = new int[] {10, 20, 30};
        int w = 50;
        int n = val.length;
        System.out.println(KS(w, wt, val, n));
    }

}
package DP;

// 0-1 KnapSack

public class Q2 {
    
    static int max(int a, int b){
        return (a > b) ? a : b;
    }

    static int KS(int w, int wt[], int val[], int n){
        // Base Condition

        if(n == 0 || w == 0){
            return 0;
        }

        if (wt[n - 1] > w){
            return KS(w, wt , val, n-1);
        }else{
            return max((val[n - 1] + KS(w - wt[n - 1], wt, val, n - 1)), (KS(w, wt, val, n - 1)));
        }
    }

    // Driver Code
    public static void main(String[] args){
        int val[] = new int[] {60, 100, 120};
        int wt[] = new int[] {10, 20, 30};
        int w = 50;
        int n = val.length;
        System.out.println(KS(w, wt, val, n));
    }

}

package String;

import java.util.*;

public class Q2 {
    public static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        
        while (i < j){

            if ( str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if(isPalindrome(str)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
