import java.lang.*;
import java.util.*;

class PrintingPattern
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(i > j) System.out.print("  ");
				else System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i + j <= 5) System.out.print("  ");
				else System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= 5-i; j++)
			{
				System.out.print("  ");
			}
			for(int j = 1; j <= 2*i - 1; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 1; i <= n-1; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("  ");
			}
			for(int j = 1; j <= 9 - (2*i); j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}