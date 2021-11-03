package BinaryTree;

import java.util.*;

import jdk.nashorn.api.tree.Tree;

public class Q1 {
    

    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
        }
    }

    // print in level order
    public static void levelOrderTraversal(TreeNode startNode){
        Queue<TreeNode> queue  = new LinkedList<TreeNode>();
        queue.add(startNode);
        while(!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            System.out.print(tempNode.data + " ");
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static TreeNode createBinaryTree(){
        TreeNode rootNode = new TreeNode(40);
        TreeNode node20 = new TreeNode(20);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node60 = new TreeNode(60);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);
        
        rootNode.left = node20;
        rootNode.right = node60;

        node20.left = node10;
        node20.right = node30;

        node60.left = node50;
        node60.right = node70;

        return rootNode;
    }
    
    public static void main(String[] args){
        // Creating a binary tree
        TreeNode rootNode = createBinaryTree();
        System.out.println("Level order traversal-");
        levelOrderTraversal(rootNode);
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
