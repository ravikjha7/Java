import java.lang.*;
import java.util.*;

class Radix
{
	public static void main(String[] args)
	{
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		if(s.matches("[01]+")) System.out.println("Binary Radix = 2");
		else if(s.matches("[0-7]+")) System.out.println("Octal Radix = 8");
		else if(s.matches("[0-9]+")) System.out.println("Decimal Radix = 10");
		else if(s.matches("[0-9A-F]+")) System.out.println("HexaDecimal Radix = 16");
		else System.out.println("Invalid");
	}
}