import java.lang.*;
import java.util.*;

class Printing
{
	public static void main(String[] args)
	{
		int x = -10;
		System.out.printf("%d\n",x); // Decimal
		System.out.printf("%o\n",x); // Octal
		System.out.printf("%x\n",x); // Hexadecimal
		float f = 7.565345f;
		System.out.printf("%f\n",f); // Decimal
		System.out.printf("%e\n",f); // Scientific Representation
		System.out.printf("%g\n",f); // Upto 5 digits only
		
		String str = "Ravi Jha";
		// Argument Index
		System.out.printf("%3$s %2$f %1$d\n",x,f,str);
		
		// Width
		System.out.printf("%20s\n",str); // Prints String in 20 places
		System.out.printf("%6.2f\n",f);
		
		// Flag -> 0 , + , - , (
		System.out.printf("%-20s\n",str); // Right Align
		System.out.printf("%020d\n",x); // Fills Width with 0
		System.out.printf("%+20d\n",x); // Prints Sign Also
		System.out.printf("%(20d\n",x); // Prints Number Into Brackets
	}
}