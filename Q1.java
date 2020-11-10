package CP_CrackerList_Sols;

import java.util.*;

public class Q1 {
    static void reverseArray(String arr[],int start,int end){
        String temp;
        if(start >= end){
            return;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1,end - 1);
    }
    static void printArray(String arr[],int size){
        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] length = new String[t];
		for(int i = 0; i < t; i++){
		    length[i] = sc.next();
		}
		reverseArray(length,0,t-1);
		printArray(length,t);
	}    
}
