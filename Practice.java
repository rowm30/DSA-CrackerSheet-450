package BinaryTree;

import java.util.*;

public class Q2 {
    
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
        }

    }

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

        // Initial index of merged sub array
        int k = l;
        while(i < n1 && j < n2){
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining elements 

        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int r){
        if (l < r) {
            // Find the middle point
            int m = l + (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m+1, r);

            // Merge the sorted halves
            merge(arr,l , m,  r);
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.*;

public class Q2 {
    
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
        }

    }

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

        // Initial index of merged sub array
        int k = l;
        while(i < n1 && j < n2){
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining elements 

        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int r){
        if (l < r) {
            // Find the middle point
            int m = l + (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m+1, r);

            // Merge the sorted halves
            merge(arr,l , m,  r);
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}


    // print in revesal level order\sdfklahdsfijkhadsjkfhadjksbgfahjkldsbfghjadsbvfhjabdsfabvdjklshfbvadhjsfbvadhjs
    public static void reverseLOT(TreeNode startNode){
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        queue.add(startNode);
        while(!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            stack.push(tempNode);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop().data + " ");
        }
    }

    public static TreeNode createBinaryTree()
	{
 
		TreeNode rootNode =new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		return rootNode;
    }
    
    public static void main(String[] args){
        Q2 bi  = new Q2();
        // Creating a binary tree
        TreeNode rootNode = createBinaryTree();
        System.out.println("In reverse LOT");
        reverseLOT(rootNode);
    }
}
package BinaryTree;

import java.util.*;

public class Q2 {
    
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
        }

    }

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

        // Initial index of merged sub array
        int k = l;
        while(i < n1 && j < n2){
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining elements 

        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int r){
        if (l < r) {
            // Find the middle point
            int m = l + (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m+1, r);

            // Merge the sorted halves
            merge(arr,l , m,  r);
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}


    // print in revesal level order\sdfklahdsfijkhadsjkfhadjksbgfahjkldsbfghjadsbvfhjabdsfabvdjklshfbvadhjsfbvadhjs
    public static void reverseLOT(TreeNode startNode){
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        queue.add(startNode);
        while(!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            stack.push(tempNode);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop().data + " ");
        }
    }

    public static TreeNode createBinaryTree()
	{
 
		TreeNode rootNode =new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		return rootNode;
    }
    
    public static void main(String[] args){
        Q2 bi  = new Q2();
        // Creating a binary tree
        TreeNode rootNode = createBinaryTree();
        System.out.println("In reverse LOT");
        reverseLOT(rootNode);
    }
}


    // print in revesal level order\sdfklahdsfijkhadsjkfhadjksbgfahjkldsbfghjadsbvfhjabdsfabvdjklshfbvadhjsfbvadhjs
    public static void reverseLOT(TreeNode startNode){
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        queue.add(startNode);
        while(!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            stack.push(tempNode);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop().data + " ");
        }
    }

    public static TreeNode createBinaryTree()
	{
 
		TreeNode rootNode =new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		return rootNode;
    }
    
    public static void main(String[] args){
        Q2 bi  = new Q2();
        // Creating a binary tree
        TreeNode rootNode = createBinaryTree();
        System.out.println("In reverse LOT");
        reverseLOT(rootNode);
    }
}
package BinaryTree;

import java.util.*;

public class Q2 {
    
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
        }

    }

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

        // Initial index of merged sub array
        int k = l;
        while(i < n1 && j < n2){
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining elements 

        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int r){
        if (l < r) {
            // Find the middle point
            int m = l + (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m+1, r);

            // Merge the sorted halves
            merge(arr,l , m,  r);
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.*;

public class Q2 {
    
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
        }

    }

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

        // Initial index of merged sub array
        int k = l;
        while(i < n1 && j < n2){
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining elements 

        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int r){
        if (l < r) {
            // Find the middle point
            int m = l + (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m+1, r);

            // Merge the sorted halves
            merge(arr,l , m,  r);
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}


    // print in revesal level order\sdfklahdsfijkhadsjkfhadjksbgfahjkldsbfghjadsbvfhjabdsfabvdjklshfbvadhjsfbvadhjs
    public static void reverseLOT(TreeNode startNode){
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        queue.add(startNode);
        while(!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            stack.push(tempNode);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop().data + " ");
        }
    }

    public static TreeNode createBinaryTree()
	{
 
		TreeNode rootNode =new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		return rootNode;
    }
    
    public static void main(String[] args){
        Q2 bi  = new Q2();
        // Creating a binary tree
        TreeNode rootNode = createBinaryTree();
        System.out.println("In reverse LOT");
        reverseLOT(rootNode);
    }
}
package BinaryTree;

import java.util.*;

public class Q2 {
    
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
        }

    }

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

        // Initial index of merged sub array
        int k = l;
        while(i < n1 && j < n2){
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining elements 

        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int r){
        if (l < r) {
            // Find the middle point
            int m = l + (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m+1, r);

            // Merge the sorted halves
            merge(arr,l , m,  r);
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}
package BinaryTree;

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class HackerRankQ1 {
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right,data);
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
    }
    
     DFG
     
}


    // print in revesal level order\sdfklahdsfijkhadsjkfhadjksbgfahjkldsbfghjadsbvfhjabdsfabvdjklshfbvadhjsfbvadhjs
    public static void reverseLOT(TreeNode startNode){
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        queue.add(startNode);
        while(!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            stack.push(tempNode);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop().data + " ");
        }
    }

    public static TreeNode createBinaryTree()
	{
 
		TreeNode rootNode =new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		return rootNode;
    }
    
    public static void main(String[] args){
        Q2 bi  = new Q2();
        // Creating a binary tree
        TreeNode rootNode = createBinaryTree();
        System.out.println("In reverse LOT");
        reverseLOT(rootNode);
    }
}


    // print in revesal level order\sdfklahdsfijkhadsjkfhadjksbgfahjkldsbfghjadsbvfhjabdsfabvdjklshfbvadhjsfbvadhjs
    public static void reverseLOT(TreeNode startNode){
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        queue.add(startNode);
        while(!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            stack.push(tempNode);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop().data + " ");
        }
    }

    public static TreeNode createBinaryTree()
	{
 
		TreeNode rootNode =new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		return rootNode;
    }
    
    public static void main(String[] args){
        Q2 bi  = new Q2();
        // Creating a binary tree
        TreeNode rootNode = createBinaryTree();
        System.out.println("In reverse LOT");
        reverseLOT(rootNode);
    }
}
package BinaryTree;

import java.util.*;

public class Q2 {
    
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
        }

    }

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

      