import java.lang.*;
import java.util.*;

class Bits
{
	public static void main(String[] args)
	{
		// int x = -0b1010;
		// How to change sign bit also
		// int y = x >>> 1;
		// How to print any number into Binary Form
		// System.out.println(String.format("%32s",Integer.toBinaryString(x)));
		// System.out.println(String.format("%32s",Integer.toBinaryString(y)));
		byte a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextByte();
		b = sc.nextByte();
		byte c = (byte)(a << 4);
		c = (byte)(c|b);
		// System.out.println(String.format("%8s",Integer.toBinaryString(c)));
		System.out.println((c&0b11110000)>>4);
		System.out.println((c&0b1111));
	}
}