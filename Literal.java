import java.lang.*;

class Literal
{
	public static void main(String arg[])
	{
		byte a = 7; // Integer Literal // Decimal Form
		byte b = 0b111; // Binary Form
		byte c = 07; // Octal Form
		byte d = 0X7; // Hexadecimal Form
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		long l = 7; // Integer Literal Allowed
		// long l = 77777777777777777; // Not Allowed
		// Integer cannot store such large value
		long m = 777777777777777l; // Allowed Long Literal
		long n = 777_777_777; // Allowed
		// long o = 777_777_777_; // Not Allowed
		float f = 235_456.56f; // Allowed
		// float f = 235_456_._56f; // Not Allowed
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(f);
	}
}