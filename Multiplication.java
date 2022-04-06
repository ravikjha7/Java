import java.lang.*;
import java.util.*;

class Multiplication
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(n + " x " + i + " = " + n*i);
		}
	}
}