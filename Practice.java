package LinkedList;

import java.util.Scanner;

public class Q1 {
    
    class Node{
        int key;
        Node left,right;

        Node(int item){
            key = item;
            left = right = null;
        }
    }


    // Root of BST

    Node root;

    // Constructor
    Q1(){
        root = null;
    }

    Node insertRec(Node root,int key){
        if (root == null) {
            root = new Node(key);
            return root;
        }
    }
}


import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            System.out.println();
        }
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
    // The bellow code only given for practicing Bubble Sort
    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
