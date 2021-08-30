class ParkingSystem {
    int big, medium, small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        switch(carType) {
            case 1: if (big > 0 && big < 1000) { big--;return true;} else {return false;}
                
            case 2:if (medium > 0 && medium < 1000) { medium--; return true;} else {return false;}
            case 3:if (small > 0 && small < 1000) { small--; return true;} else {return false;}
                
        }
        return false;
    }
}
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
