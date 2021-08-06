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

    // print in revesal level order\
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
