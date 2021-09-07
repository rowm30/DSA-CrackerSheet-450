package BinaryTree;

class Q4 {
    Node root;
    
    int diameter(Node root){
        if (root == null){
            return 0;
        }

        int lheight = height(root.left);
        int rheight = height(root.right);

        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);

        return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));
    }

    int diameter(){ return diameter(root);}

    static int height(Node node){

        if(node == null){
            return 0;
        }

        return(1 + Math.max(height(node.left), height(node.right)));
    }

    public static void main (String args[]){
        
        Q4 tree = new Q4();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(5);
        tree.root.right.left = new Node(5);
        tree.root.right.left.right = new Node(5);
        tree.root.right.left.left = new Node(5);
        
        System.out.println("The diameter of given binary tree is : " + tree.diameter());
    }
}
package DP;

// 0-1 KnapSack

public class Q2 {
    
    static int max(int a, int b){
        return (a > b) ? a : b;
    }

    static int KS(int w, int wt[], int val[], int n){
        // Base Condition

        if(n == 0 || w == 0){
            return 0;
        }

        if (wt[n - 1] > w){
            return KS(w, wt , val, n-1);
        }else{
            return max((val[n - 1] + KS(w - wt[n - 1], wt, val, n - 1)), (KS(w, wt, val, n - 1)));
        }
    }

    // Driver Code
    public static void main(String[] args){
        int val[] = new int[] {60, 100, 120};
        int wt[] = new int[] {10, 20, 30};
        int w = 50;
        int n = val.length;
        System.out.println(KS(w, wt, val, n));
    }

}
package DP;

// 0-1 KnapSack

public class Q2 {
    
    static int max(int a, int b){
        return (a > b) ? a : b;
    }

    static int KS(int w, int wt[], int val[], int n){
        // Base Condition

        if(n == 0 || w == 0){
            return 0;
        }

        if (wt[n - 1] > w){
            return KS(w, wt , val, n-1);

    public static void main(String[] args){
        int val[] = new int[] {60, 100, 120};
        int wt[] = new int[] {10, 20, 30};
        int w = 50;
        int n = val.length;
        System.out.println(KS(w, wt, val, n));
    }

}

class Node{
    int data;
    Node left,right;

    public Node(int item){
        data = item;
        left = right = null;
    }
}