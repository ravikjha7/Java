import java.lang.*;
import java.util.*;

class Matrices
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int A[][] = new int[n][n];
		int B[][] = new int[n][n];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				A[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				B[i][j] = sc.nextInt();
			}
		}
		int C[][] = new int[n][n];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				int ans = 0;
				for(int k = 0; k < n; k++)
				{
					ans += (A[i][k]*B[k][j]);
				}
				C[i][j] = ans;
			}
		}
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
	}
}