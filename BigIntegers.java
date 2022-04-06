import java.lang.*;
import java.util.*;
import java.math.BigInteger;

class BigIntegers
{
	public static void main(String arg[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(factorial(n));
	}
	
	static BigInteger factorial(int n)
	{
		BigInteger ans = new BigInteger("1");
		for(int i = 2; i <= n; i++)
		{
			ans = ans.multiply(BigInteger.valueOf(i));
		}
		return ans;
	}
}