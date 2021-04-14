package DP;

import java.util.*;

public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of types of coins: ");
        int numberOfCoins = sc.nextInt();
        int[] coins = new int[numberOfCoins];
        System.out.println("Enter the coins: ");
        for (int i = 0; i < numberOfCoins; i++) {
            coins[i] = sc.nextInt();
        }
        System.out.println("Enter the sum: ");
        int sum = sc.nextInt();
    }

    public static int findWays(int[] coins,int sum){
        // Declaring a 2-D array
        // for storing solution to subproblems:
        int size = coins.length;
        int[][] arr = new int[size+1][sum+1];

        // Initialize first column of array to 1
        // because a sum of 0 can be made
        // in one possible way: {0}
        for(int i = 0; i < size + 1; i++){
            arr[i][0] = 1;
        }
        // Applying the recurssive solution
    }
}
