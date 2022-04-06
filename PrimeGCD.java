import java.lang.*;
import java.util.*;

class PrimeGCD
{
	static Boolean isPrime(int n)
	{
		int flag = 1;
		if(n <= 1) return false;
		for(int i = 2; i <= Math.sqrt(n); i++)
		{
			if(n % i == 0) {
				flag = 0;
				break;
			}
		}
		if(flag == 1) return true;
		return false;
	}
	static int gcd(int a,int b)
	{
		if(b == 0) return a;
		return gcd(b,a%b);
	}
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(isPrime(n)) System.out.println("Prime");
		else System.out.println("Not Prime");
		int p;
		p = sc.nextInt();
		System.out.println("GCD Of Two Numbers : " + gcd(n,p));
	}
}