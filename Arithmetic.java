import java.lang.*;

class Arithmetic
{
	public static void main(String[] args)
	{
		// int a = 7, b = 3;
		// int d = a/b;
		// float d = (float)a/b;
		// int r = a%b;
		// System.out.println(d);
		// System.out.println(r);
		// float a = 7.7f, b = 3.3f;
		// float r = a % b;
		// System.out.println(r);
		// byte a = 7;
		// short b = 3;
		// byte c = a+b; // Wrong byte+short returns integer
		// int c = a + b; // Correct
		// System.out.println(c);
		long a = 7;
		int b = 3;
		// int c = a + b; // Wrong int+long returns long
		long c = a + b; // Correct
		System.out.println(c);
	}
}