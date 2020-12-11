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