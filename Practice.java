import java.util.*;

class Practice{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibo(n));
	}
	public static int fibo(int n){
		int ans=0;
		if(n<=0){
			return ans;
		}
		if (n==1) {
			ans = 1;
			return ans;
		}
		ans = fibo(n-2) + fibo(n-1);
		return ans;
	}
}