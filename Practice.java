package BinaryTree;

import java.util.*;

public class Q6 {
    
    public static void preOrder(Node root){
        // return if the current node is empty
        if(root == null){
            return;
        }

        // Display the data part of the root(or current node)
        System.out.print(root.data + " ");

        // Traverse the left subtree 
        preOrder(root.left);

        // Traverse the right subtree
        preOrder(root.right);
    }

    public static Node insert(Node root,int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.data);
                root.left = cur;
            }else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Node root = null;
        while(t-- > 0){
            int data = sc.nextInt();
            root = insert(root, data);
        }
        sc.close();
        preOrder(root);
    }

}

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


class Node{
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}