import java.lang.*;
import java.util.*;

class UseRadix
{
	public static void main(String arg[])
	{
		int x;
		Scanner s = new Scanner(System.in);
		s.useRadix(2);
		x = s.nextInt();
		System.out.println(x);
	}
}