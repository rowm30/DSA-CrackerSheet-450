import java.util.*;

public class Q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                if (arr[j] == 0) {
                    System.out.print(0+" ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (arr[j] == 1) {
                    System.out.print(1+" ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (arr[j] == 2) {
                    System.out.print(2+" ");
                }
            }
            System.out.println("");
        }
    }
}