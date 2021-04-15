package Fundamentals;

import java.util.*;

public class MergeSort{

    public static void merge(int[] arr, int l, int m, int r){

        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp array
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + 1 + i];
        }

        // Merge the temp arrays

        int i = 0, j = 0;

        
    }
}