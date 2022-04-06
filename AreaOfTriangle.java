import java.lang.*;
import java.util.*;

class AreaOfTriangle
{
	public static void main(String[] args)
	{
		// float b,h;
		Scanner sc = new Scanner(System.in);
		// b = sc.nextFloat();
		// h = sc.nextFloat();
		// float area = b*h/2;
		// System.out.println(area);
		float a,b,c;
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		float s = (a+b+c)/2.0f;
		float area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(area);
	}
}