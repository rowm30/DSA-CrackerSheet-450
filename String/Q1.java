package String;

import java.util.*;

public class Q1 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] s = input.toCharArray();
        reverseString(s);
        System.out.print(s);
    }

    public static void reverseString(char[] s){
        helper(s, 0, s.length-1);
    }

    public static void helper(char[] s, int left, int right){
        if (left>= right) {
            return;
        }
        char temp = s[left];
        s[left++] = s[right];
        s[right--] = temp;
        helper(s, left, right);
    }

}
