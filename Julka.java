import java.lang.*;
import java.util.*;
import java.math.BigInteger;

class Julka
{
	static void solve(BigInteger a,BigInteger b)
	{
		BigInteger m = a.subtract(b);
		m = m.divide(BigInteger.valueOf(2));
		BigInteger o = m.add(b);
		System.out.println(o);
		System.out.println(m);
	}
	public static void main(String arg[])
	{
		BigInteger a,b;
		Scanner sc = new Scanner(System.in);
		int t = 10;
		while(t > 0) {
			a = sc.nextBigInteger();
			b = sc.nextBigInteger();
			solve(a,b);
			t--;
		}
	}
}