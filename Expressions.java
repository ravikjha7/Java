import java.lang.*;
import java.util.*;

class Expressions
{
	public static void main(String[] args)
	{
		String s,s1,s2;
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		s = String.valueOf(a);
		if(s.matches("[01]+")) 
		{
			System.out.println("Binary");
		}
		else 
		{
			System.out.println("Not Binary");
		}
		s1 = sc.next();
		if(s1.matches("[0-9A-F]*")) 
		{
			System.out.println("HexaDecimal");
		}
		else 
		{
			System.out.println("Not HexaDecimal");
		}
		s2 = sc.next();
		if(s2.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"))
		{
			System.out.println("It's a Date!!");
		}
		else 
		{
			System.out.println("Not a Date!!!");
		}
	}
}