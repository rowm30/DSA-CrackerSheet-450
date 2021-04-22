import java.io.ObjectInputFilter.FilterInfo;
import java.util.*;

public class QuickSort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int l, int h) {

        int pivot = arr[l];
        int i = l;
        int j = h;

        while (i < j) {

            while (arr[i] <= pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, j, l);
        
        return j;
    }

    public static void sort(int[] arr, int l, int h){
        if (l < h) {
            int pivot = partition(arr, l, h);

            sort(arr, l, pivot - 1);
            sort(arr, pivot + 1, h);
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

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, 0, n-1);

        printArray(arr);
    }
}
