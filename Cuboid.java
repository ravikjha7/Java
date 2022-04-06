import java.lang.*;
import java.util.*;

class Cuboid
{
	public static void main(String[] arg)
	{
		int l,b,h;
		Scanner sc = new Scanner(System.in);
		l = sc.nextInt();
		b = sc.nextInt();
		h = sc.nextInt();
		long area = 2*((l*b) + (b*h) + (l*h));
		long volume = l*b*h;
		System.out.println("Total Area : " + area);
		System.out.println("Total Volume : " + volume);
	}
}