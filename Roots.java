import java.lang.*;
import java.util.*;

class Roots
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Coefficients Of Quadraric Equation : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		double factor = b*b - 4*a*c;
		if(factor < 0.0) {
			System.out.println("Roots Are Imaginary");
		}
		else {
			factor = Math.sqrt(factor);
			double root1 = (-b - factor)/(2.0f*a);
			double root2 = (-b + factor)/(2.0f*a);
			System.out.println("Roots Of Quadratic Equation Are : ");
			System.out.println(root1);
			System.out.println(root2);
		}
	}
}