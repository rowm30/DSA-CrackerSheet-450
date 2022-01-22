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
package String;

// Q3 Find Duplicate characters in a string

public class Q3 {
    static final int NO_OF_CHARS = 256;

    static void fillCharCounts(String str,int[] count){
        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i)]++;
        }
    }

    static void printDups(String str){
        int count[] = new int[NO_OF_CHARS];
        fillCharCounts(str,count);
        for(int i = 0; i < NO_OF_CHARS; i++){
            if(count[i] > i){
                System.out.println((char)(i)+ ", count = " + count[i]);
            }
        }
    }
    package String;

// Q3 Find Duplicate characters in a string
package String;

// Q3 Find Duplicate characters in a string

public class Q3 {
    static final int NO_OF_CHARS = 256;

    static void fillCharCounts(String str,int[] count){
        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i)]++;
        }
    }

    static void printDups(String str){
        int count[] = new int[NO_OF_CHARS];
        fillCharCounts(str,count);
        for(int i = 0; i < NO_OF_CHARS; i++){
            if(count[i] > i){
                System.out.println((char)(i)+ ", count = " + count[i]);
            }
        }
    }

    public static void main(String[] args){
        String str = "test string";
        printDups(str);
    }package String;

    // Q3 Find Duplicate characters in a string
    
    public class Q3 {
        static final int NO_OF_CHARS = 256;
    
        static void fillCharCounts(String str,int[] count){
            for(int i = 0; i < str.length(); i++){
                count[str.charAt(i)]++;
            }
        }
    
        static void printDups(String str){
            int count[] = new int[NO_OF_CHARS];
            fillCharCounts(str,count);
            for(int i = 0; i < NO_OF_CHARS; i++){
                if(count[i] > i){
                    System.out.println((char)(i)+ ", count = " + count[i]);
                }
            }
        }
    
        public static void main(String[] args){
            String str = "test string";
            printDups(str);
        }package String;

        // Q3 Find Duplicate characters in a string
        
        public class Q3 {
            static final int NO_OF_CHARS = 256;
        
            static void fillCharCounts(String str,int[] count){
                for(int i = 0; i < str.length(); i++){
                    count[str.charAt(i)]++;
                }
            }
        
            static void printDups(String str){
                int count[] = new int[NO_OF_CHARS];
                fillCharCounts(str,count);
                for(int i = 0; i < NO_OF_CHARS; i++){
                    if(count[i] > i){
                        System.out.println((char)(i)+ ", count = " + count[i]);
                    }
                }
            }
        
            public static void main(String[] args){
                String str = "test string";
                printDups(str);
            }package String;

            // Q3 Find Duplicate characters in a string
            
            public class Q3 {
                static final int NO_OF_CHARS = 256;
            
                static void fillCharCounts(String str,int[] count){
                    for(int i = 0; i < str.length(); i++){
                        count[str.charAt(i)]++;
                    }
                }
            
                static void printDups(String str){
                    int count[] = new int[NO_OF_CHARS];
                    fillCharCounts(str,count);
                    for(int i = 0; i < NO_OF_CHARS; i++){
                        if(count[i] > i){
                            System.out.println((char)(i)+ ", count = " + count[i]);
                        }
                    }
                }
                package String;

                // Q3 Find Duplicate characters in a string
                
                public class Q3 {
                    static final int NO_OF_CHARS = 256;
                
                    static void fillCharCounts(String str,int[] count){
                        for(int i = 0; i < str.length(); i++){
                            count[str.charAt(i)]++;
                        }
                    }
                
                    static void printDups(String str){
                        int count[] = new int[NO_OF_CHARS];
                        fillCharCounts(str,count);
                        for(int i = 0; i < NO_OF_CHARS; i++){
                            if(count[i] > i){
                                System.out.println((char)(i)+ ", count = " + count[i]);
                            }
                        }
                    }
                    package String;

                    // Q3 Find Duplicate characters in a string
                    
                    public class Q3 {
                        static final int NO_OF_CHARS = 256;
                    
                        static void fillCharCounts(String str,int[] count){
                            for(int i = 0; i < str.length(); i++){
                                count[str.charAt(i)]++;
                            }
                        }
                    
                        static void printDups(String str){
                            int count[] = new int[NO_OF_CHARS];
                            fillCharCounts(str,count);
                            for(int i = 0; i < NO_OF_CHARS; i++){
                                if(count[i] > i){
                                    System.out.println((char)(i)+ ", count = " + count[i]);
                                }
                            }
                        }
                        package String;

// Q3 Find Duplicate characters in a string

public class Q3 {
    static final int NO_OF_CHARS = 256;

    static void fillCharCounts(String str,int[] count){
        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i)]++;
        }
    }

    static void printDups(String str){
        int count[] = new int[NO_OF_CHARS];
        fillCharCounts(str,count);
        for(int i = 0; i < NO_OF_CHARS; i++){
            if(count[i] > i){
                System.out.println((char)(i)+ ", count = " + count[i]);
            }
        }
    }

    public static void main(String[] args){
        String str = "test string";
        printDups(str);
    }
                    
                        public static void main(String[] args){
                            String str = "test string";
                            printDups(str);
                        }
                    public static void main(String[] args){
                        String str = "test string";
                        printDups(str);
                    }
                public static void main(String[] args){
                    String str = "test string";
                    printDups(str);
                }
public class Q3 {
    static final int NO_OF_CHARS = 256;

    static void fillCharCounts(String str,int[] count){
        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i)]++;
        }
    }

    static void printDups(String str){
        int count[] = new int[NO_OF_CHARS];
        fillCharCounts(str,count);
        for(int i = 0; i < NO_OF_CHARS; i++){
            if(count[i] > i){
                System.out.println((char)(i)+ ", count = " + count[i]);
            }
        }
    }

    // Java program to find height of tree

class Q3{
    NodeXL root;

    int maxDepth(NodeXL node){
        if (node == null) {
            return 0;
        } else {
            // Compute the depth of each sub tree
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            // Use the larger one 
            if (lDepth>rDepth) {
                return(lDepth+1);
            } else {
                return(rDepth+1);
            }
        }
    }

    public static void main(String[] args){
        Q3 tree = new Q3();

        tree.root = new NodeXL(1);
        tree.root.left = new NodeXL(2);
        tree.root.right = new NodeXL(3);
        tree.root.left.left = new NodeXL(4);
        tree.root.left.right = new NodeXL(5);
        tree.root.left.right.left = new NodeXL(5);
        tree.root.left.right.right = new NodeXL(5);
        tree.root.left.left.right = new NodeXL(5);
        tree.root.left.left.right = new NodeXL(5);
        tree.root.right.left = new NodeXL(5);
        tree.root.right.right = new NodeXL(5);
        tree.root.right.right.left = new NodeXL(5);
        tree.root.right.right.left.right = new NodeXL(5);
        
        System.out.println("Height is : " + tree.maxDepth(tree.root));
    }
}

// Java program to find height of tree

class Q3{
    NodeXL root;

    int maxDepth(NodeXL node){
        if (node == null) {
            return 0;
        } else {
            // Compute the depth of each sub tree
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            // Use the larger one 
            if (lDepth>rDepth) {
                return(lDepth+1);
            } else {
                return(rDepth+1);
            }
        }
    }

    public static void main(String[] args){
        Q3 tree = new Q3();

        tree.root = new NodeXL(1);
        tree.root.left = new NodeXL(2);
        tree.root.right = new NodeXL(3);
        tree.root.left.left = new NodeXL(4);
        tree.root.left.right = new NodeXL(5);
        tree.root.left.right.left = new NodeXL(5);
        tree.root.left.right.right = new NodeXL(5);
        tree.root.left.left.right = new NodeXL(5);
        tree.root.left.left.right = new NodeXL(5);
        tree.root.right.left = new NodeXL(5);
        tree.root.right.right = new NodeXL(5);
        tree.root.right.right.left = new NodeXL(5);
        tree.root.right.right.left.right = new NodeXL(5);
        
        System.out.println("Height is : " + tree.maxDepth(tree.root));
    }
}

class NodeXL{
    int data;
    NodeXL left,right;

    NodeXL(int item){
        data = item;
        left = right = null;
    }
}

class NodeXL{
    int data;
    NodeXL left,right;

    NodeXL(int item){
        data = item;
        left = right = null;
    }
}
    public static void main(String[] args){
        String str = "test string";
        printDups(str);
    }

    public static void main(String[] args){
        String str = "test string";
        printDups(str);
    }