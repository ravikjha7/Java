import java.lang.*;
import java.util.*;

class Fibonacci
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a = 1;
		int b = 0,c;
		System.out.print("0 ");
		if(n >= 2)
		System.out.print(a + " ");
		for(int i = 0; i < n-2; i++)
		{
			c = a+b;
			b = a;
			a = c;
			System.out.print(a + " ");
		}
	}
}