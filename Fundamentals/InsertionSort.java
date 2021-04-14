package Fundamentals;

import java.util.*;

public class InsertionSort {
    
    public static int[] insertionSort(int[] arr){
        int n = arr.length;

        for(int j = 1; j < n; j++){
            int temp = arr[j];
            int i = j - 1;
            while( (i >= 0) && (arr[i] > temp) ) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = temp;
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(insertionSort(arr));
    }
}
