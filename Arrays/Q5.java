// Move all negative numbers to beginning and positive to end with constant extra space

import java.util.*;

public class Q5{

    public static void rearrange(int arr[], int n){
        int j = 0, temp;
        for(int i = 0; i < n; i++){
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
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

        rearrange(arr, n);
        printArray(arr);
    }
}