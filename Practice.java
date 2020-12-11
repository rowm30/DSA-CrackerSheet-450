// JAVA Code to count number of
// digits in an integer
import java.util.*;

class GFG {

	static int countDigit(long n)
	{
		return (int)Math.floor(Math.log10(n) + 1);
	}

	/* Driver code */
	public static void main(String[] args)
	{
		long n = 20400189322l;
		System.out.print("Number of digits : "
						+ countDigit(n));
	}
}
// This code is contributed by Arnav Kr. Mandal.
