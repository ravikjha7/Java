import java.lang.*;
import java.util.Scanner;
class Swap
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		// Swapping Process
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("Value Of a : " + a);
		System.out.println("Value Of b : " + b);
	}
}