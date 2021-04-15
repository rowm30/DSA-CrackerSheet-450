package Fundamentals;

import java.util.*;

public class MergeSort {
    
    public static void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }

        for (int i = 0; i < n2; ++i) {
            R[i] = arr[m + 1 + i];
        }
    }
}
